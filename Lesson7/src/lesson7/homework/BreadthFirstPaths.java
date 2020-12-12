package lesson7.homework;

import java.util.LinkedList;

public class BreadthFirstPaths extends Paths
{
    public BreadthFirstPaths(Graph g, int source)
    {
        super(g, source);
    }

    @Override
    protected void search(Graph g)
    {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(source);
        marked[source] = true;
        while (!queue.isEmpty())
        {
            int vertex = queue.removeFirst();
            for (int w : g.getAdjList(vertex))
            {
                if (!marked[w])
                {
                    marked[w] = true;
                    edgeTo[w] = vertex;
                    queue.addLast(w);
                }
            }
        }
    }
}
