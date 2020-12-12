package lesson7.homework;

import java.util.LinkedList;

public abstract class Paths
{
    protected final int source;
    protected final boolean[] marked;
    protected final int[] edgeTo;

    public Paths(Graph g, int source)
    {
        this.source = source;
        this.edgeTo = new int[g.getVertexCount()];
        this.marked = new boolean[g.getVertexCount()];

        search(g);
    }

    public boolean hasPathTo(int dest) {
        return marked[dest];
    }

    public LinkedList<Integer> pathTo(int dest) {
        if (!hasPathTo(dest)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dest;
        while (vertex != source) {
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }

    protected abstract void search(Graph g);
}
