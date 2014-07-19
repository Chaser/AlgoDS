import java.util.*;

class Graph 
{
	private int V;
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
		return this.V;
	}

	public int E()
	{
		return this.E;
	}

	public void addEdge(int v, int w)
	{
		adj[v].addFirst(w);
		adj[w].addFirst(v);
		E++;
	}

	public Iterable<Integer> adj(int v)
	{
		return adj[v];
	}
}

public class BreadthFirstPaths
{
	private boolean[] marked;
	private int[] edgeTo;
	private final int source;

	public BreadthFirstPaths(Graph G, int source)
	{
		marked = new boolean[G.V()];
		edgeTo = new int[G.V()];
		this.source = source;
		bfs(G, source);
	}

	private void bfs(Graph G, int source)
	{
		LinkedList<Integer> queue = new LinkedList<Integer>();
		marked[source] = true;
		queue.addLast(source);
		while(!queue.isEmpty())
		{
			int v = queue.removeFirst();
			System.out.print("V=" + v);
			for(int w : G.adj(v))
			{
				System.out.print(" w=" + w);
				if(!marked[w])
				{
					edgeTo[w] = v;
					marked[w] = true;
					queue.addLast(w);
				}
			}
			System.out.println("");
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
		for(int x = v; x != source; x = edgeTo[x])
		{
			System.out.print("x=" + x + " ");
			path.push(x);
		}
		path.push(source);
		System.out.println("s=" + source);
		System.out.println("path:" + path);
		return path;
	}

	public static void main(String[] args)
  	{
  		int V = 6;
  		int source = 0;
		Graph G = new Graph(V);
		G.addEdge(0,5);
		G.addEdge(2,4);
		G.addEdge(2,3);
		G.addEdge(1,2);
		G.addEdge(0,1);
		G.addEdge(3,4);
		G.addEdge(3,5);
		G.addEdge(0,2);
		BreadthFirstPaths search = new BreadthFirstPaths(G, source);
     	for (int v = 0; v < G.V(); v++)
     	{
        	System.out.print(source + " to " + v + ": ");
        	if (search.hasPathTo(v))
        	{
           		for (int x : search.pathTo(v))
           		{
              		if (x == source) 
              			System.out.print(x);
              		else System.out.print("-" + x);
           		}
           		System.out.println("");
        	}
     	}
	}
}



