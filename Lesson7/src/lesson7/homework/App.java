package lesson7.homework;

public class App
{
    public static void main(String[] args)
    {
//        Граф: https://graphonline.ru/tmp/saved/Tm/TmEXGVaRwwvAzLPG.png

        Graph graph = getGraph();

        BreadthFirstPaths paths = new BreadthFirstPaths(graph, 5);

        System.out.println("5 -> 3: " + paths.hasPathTo(3));
        System.out.println("5 -> 3: " + paths.pathTo(3));
    }

    private static Graph getGraph()
    {
        Graph graph = new Graph(10);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 5);
        graph.addEdge(0, 7);
        graph.addEdge(0, 9);
        graph.addEdge(1, 4);
        graph.addEdge(2, 7);
        graph.addEdge(3, 4);
        graph.addEdge(3, 6);
        graph.addEdge(8, 9);

        return graph;
    }
}
