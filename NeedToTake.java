package prereqchecker;

import java.util.*;

public class NeedToTake {
    public static void main(String[] args) {

        if ( args.length < 3 ) {
            StdOut.println("Execute: java NeedToTake <adjacency list INput file> <need to take INput file> <need to take OUTput file>");
            return;
        }

        hashmap map = new hashmap(args[0]);
        StdIn.setFile(args[1]);

        String str = " ";

        ArrayList<String> array = new ArrayList<String>();
        ArrayList<String> array2 = new ArrayList<String>();
        ArrayList<String> array3 = new ArrayList<String>();
        ArrayList<String> array4 = new ArrayList<String>();

        while (!StdIn.isEmpty()) {
            str = StdIn.readLine();
            int temp = StdIn.readInt();
            StdIn.readLine();

            for (int i = 0; i < temp; i++)
            {
                array.add(StdIn.readLine());
            }
        }


        array2.addAll(array);


        for (int i = 0; i < array.size(); i++) {
            if (map.getPoint(array.get(i)).size() != 0) 
            {
                for (int b = 0; b < map.getPoint(array.get(i)).size(); b++)
                {
                    locate(array2, map.getPoint(array.get(i)).get(b), map);
                }
            }
        }

        for (int i = 0; i < map.getPoint(str).size(); i++) 
        {
            locate(array3, map.getPoint(str).get(i), map);
        }

        for (int i = 0; i < array3.size(); i++) 
        {
            if (!array2.contains(array3.get(i)))
            {
                array4.add(array3.get(i));
            }
        }


        StdOut.setFile(args[2]);


        for (int i = 0; i < array4.size(); i++) 
        {
            StdOut.println(array4.get(i));
        }
    }

    private static void locate(ArrayList<String> array, String str, hashmap map) {

        if (!array.contains(str))
        {
            array.add(str);
        }

        if(map.getPoint(str).size()!=0) 
        {
            for(int i = 0; i < map.getPoint(str).size(); i++)
            {
                locate(array, map.getPoint(str).get(i), map);
            }
        }

    }
}

