package prereqchecker;

import java.util.*;

public class Eligible {
    public static void main(String[] args) {

        if ( args.length < 3 ) {
            StdOut.println("Execute: java -cp bin prereqchecker.Eligible <adjacency list INput file> <eligible INput file> <eligible OUTput file>");
            return;
        }

        hashmap map = new hashmap(args[0]);
        StdIn.setFile(args[1]);

        int x = StdIn.readInt();
        StdIn.readLine();

        ArrayList<String> array = new ArrayList<String>();
        ArrayList<String> array2 = new ArrayList<String>();
        ArrayList<String> array3 = new ArrayList<String>();


        for (int i = 0; i < x; i++) 
        {
            String a = StdIn.readLine();
            array.add(a);
        }
        array2.addAll(array);

        for (int i = 0; i < array.size(); i++) 
        {
            find(array2, map.getPoint(array.get(i)).get(0), map);
        }
        for (String str : map.getMap().keySet()) 
        {
            if ((!array2.contains(str))&&(array2.containsAll(map.getPoint(str)))) 
            {
                array3.add(str);
            }
        }
        if (!array2.contains("cs111")) 
        {
            array3.add("cs111");
        }
        if (!array2.contains("mat151")) 
        {
            array3.add("mat151");
        }
        StdOut.setFile(args[2]);
        
        for (int i = 0; i < array3.size(); i++) 
        {
            String temp = array3.get(i);
            StdOut.println(temp);
        }
    }


    private static void find(ArrayList<String> array, String str, hashmap map) {

        if (!array.contains(str)) 
        {
            array.add(str);
        }

        if (map.getPoint(str).size() != 0) 
        {
            for(int i = 0; i < map.getPoint(str).size(); i++)
            {
                find(array, map.getPoint(str).get(i), map);
            }
        }
    }
}
