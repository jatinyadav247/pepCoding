import java.util.*;
public class PrintAllPaths {
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
		int n = sc.nextInt(),m=sc.nextInt();
		List<Edge> yadav[] = new ArrayList[n];
		for(int i=0;i<=n-1;i++) {
			yadav[i] = new ArrayList<Edge>();
		}
		System.out.println("please enter the edges");
		for(int i=0;i<=m-1;i++) {
			int s = sc.nextInt();
			int r = sc.nextInt();
			int weight = sc.nextInt();
			yadav[s].add(new Edge(s,r,weight));
			yadav[r].add(new Edge(r,s,weight));
		}
		System.out.println("please enter the source and destination");
		int source = sc.nextInt();
		int destination = sc.nextInt();
		boolean[] visited = new boolean[n];
		//String psf = " ";
		printAllPaths(yadav, source, destination, visited,source +" ");
	}
	public static void printAllPaths(List<Edge> yadav[],int source,int destination,boolean[] visited,String psf) {
		if(source==destination) {
			System.out.println(psf);
			return;
		}
		visited[source] = true;
		for(Edge neha : yadav[source]) {
			if(!visited[neha.neigh]) {
				printAllPaths(yadav, neha.neigh, destination, visited,psf + neha.neigh);
				
			}
		
			
			
		}
		visited[source]=false;
		
		
	}

}
