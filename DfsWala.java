import java.util.*;
public class DfsWala {
	static class Edge{
		int source;
		int neigh;
		int weight;
		public Edge(int source,int neigh,int weight) {
			this.source = source;
			this.neigh = neigh;
			this.weight = weight;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt(),e=sc.nextInt();
		ArrayList<Edge> yadav[] = new ArrayList[v];
		for(int i =0;i<=yadav.length-1;i++) {
			yadav[i] = new ArrayList<Edge>();
		}
		for(int i=0;i<=e-1;i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int weight = sc.nextInt();
			yadav[v1].add(new Edge(v1, v2, weight));
			yadav[v2].add(new Edge(v2, v1, weight));
		}
		int source = sc.nextInt();
		int destination = sc.nextInt();
		boolean[] visited = new boolean[yadav.length];
	boolean meghna =	hasPath(yadav, source, destination, visited);
	if(meghna==true) {
		System.out.println("meghna is sharma");
	}
	else {
		System.out.println("megha is yadav");
	}
	}
	public static boolean hasPath(ArrayList<Edge> yadav[],int source,int destination,boolean[] visited) {
		if(source==destination) {
			return true;
	}
     	 visited[source]=true;
		for(Edge edge :yadav[source]) {
			if(visited[edge.neigh]==false) {
				boolean hasPath = hasPath(yadav, edge.neigh, destination, visited);
				if(hasPath==true) {
					return true;
				}
			}
			
			
		}
		return false;
		
	}

}
