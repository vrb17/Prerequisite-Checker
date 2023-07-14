package prereqchecker;
import java.util.*;

public class hashmap {
    
    private final int vertex;
    private HashMap <String, ArrayList<String>> map;

    public hashmap (String inputFileName) {

        StdIn.setFile(inputFileName);
        int x = 1;

        while (!StdIn.isEmpty()) {
            x = StdIn.readInt();
            StdIn.readLine();
            this.map = new HashMap<>();

            for (int i = 0; i < x; i++) {
                String temp = StdIn.readLine();
                map.put(temp, new ArrayList<String>());
            }

            int y = StdIn.readInt();
            StdIn.readLine();

            for (int j = 0; j < y; j++) {
                String temp = StdIn.readLine();
                String[] temp2= temp.split(" ");
                ArrayList<String> z = map.get(temp2[0]);
                z.add(temp2[1]);
            } 
        }


        this.vertex = x;   
    }


    public int getVertex () 
    {
        return vertex;
    }

    public HashMap<String, ArrayList<String>> getMap()
    {
        return map;
    }

    public ArrayList<String> getPoint(String str)
    {
        return map.get(str);
    }
    
    public void addPoint(String a,String b)
    {
        map.get(a).add(0,b);
    }

}
