package prereqchecker;

public class AdjList {
    public static void main(String[] args) {

        if ( args.length < 2 ) {
            StdOut.println("Execute: java -cp bin prereqchecker.AdjList <adjacency list INput file> <adjacency list OUTput file>");
            return;
        }

        hashmap map = new hashmap(args[0]);
        StdOut.setFile(args[1]);

        for (String str : map.getMap().keySet()) {
            StdOut.print(str + " ");
            for (int i = 0; i < map.getPoint(str).size(); i++) 
                StdOut.print(map.getPoint(str).get(i) + " ");    
            StdOut.println();
        }
    }
}
