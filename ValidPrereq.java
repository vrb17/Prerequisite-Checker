package prereqchecker;

public class ValidPrereq {
    public static void main(String[] args) {

        if ( args.length < 3 ) {
            StdOut.println("Execute: java -cp bin prereqchecker.ValidPrereq <adjacency list INput file> <valid prereq INput file> <valid prereq OUTput file>");
            return;
        }
        hashmap map = new hashmap (args[0]);
        StdIn.setFile(args[1]);

        String a = StdIn.readLine();
        String b = StdIn.readLine();

        map.addPoint(a, b);
        String temp = map.getPoint(a).get(0);
        String str = find(temp, a, map);
        
        StdOut.setFile(args[2]);
        StdOut.println(str);
    }
    private static String find(String a, String b, hashmap map) 
    {

        if (a.compareTo(b) == 0) 
        {
            return "NO";
        } 
        else 
        {
            for (int i = 0; i < map.getPoint(a).size(); i++) 
            {
                if(find(map.getPoint(a).get(i),b,map).compareTo("NO") == 0) 
                {
                    return "NO";
                }
            }
            return "YES";
        }

}

}
