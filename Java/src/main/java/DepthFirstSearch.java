
import java.util.*;

class Graph 
{
	private final int V;
	private int E;
	private LinkedList<Integer>[] adj;
	public Graph(int V)
	{
		this.V = V;
		this.E = 0;
		adj = new LinkedList[V];
		for(int v = 0; v < V; v++)
			adj[v] = new LinkedList<Integer>();
	}

	public int V()
	{
		return V;
	}

	public int E()
	{
		return E;
	}

	public void addEdge(int v, int w)
	{
		adj[v].add(w);
		adj[w].add(v);
		E++;
	}

	public Iterable<Integer> adj(int v)
	{
		return adj[v];
	}

}


public class DepthFirstSearch
{
	private boolean[] marked;
	private int[] edgeTo;
	private final int source;

	public DepthFirstSearch(Graph G, int source)
	{
		marked = new boolean[G.V()];
		edgeTo = new int[G.V()];
		this.source = source;
		dfs(G, source);
	}

	private void dfs(Graph G, int v)
	{
		marked[v] = true;
		for (int w: G.adj(v))
		{
			if(!marked[v])
			{
				edgeTo[w] = v;
				dfs(G, w);
			}
		}
	}

	public boolean hasPathTo(int v)
	{
		return marked[v];
	}

	public Iterable<Integer> pathTo(int v)
	{
		if(!hasPathTo(v))
			return null;

		Stack<Integer> path = new Stack<Integer>();
		for(int x = v; x!= source; x = edgeTo[x])
		{
			path.push(x);
		}
		path.push(source);
		return path;
	}

	/*


		 public static void main(String[] args)
  {
     Graph G = new Graph(new In(args[0]));
     int s = Integer.parseInt(args[1]);
     Paths search = new Paths(G, s);
     for (int v = 0; v < G.V(); v++)
     {
        StdOut.print(s + " to " + v + ": ");
        if (search.hasPathTo(v))
           for (int x : search.pathTo(v))
              if (x == s) StdOut.print(x);
              else StdOut.print("-" + x);
        StdOut.println();
     }
}




	*/
}

