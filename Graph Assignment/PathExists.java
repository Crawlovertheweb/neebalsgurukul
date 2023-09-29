package LeetCode;

import java.util.ArrayList;

public class PathExists 
{
	public static boolean Path(int n, int[][] e, int src, int dest) {
		 ArrayList<Integer>[]g=new ArrayList[n];
		 for(int i=0;i<n;i++)
		 {
			 g[i]=new ArrayList<>();
		 }
		 for (int [] edge : e) 
		 {
			 int u=edge[0];
			 int v=edge[1];
			 g[u].add(v);
			 g[v].add(u);
		}
		
		 return hasPath(g,src,dest,new boolean[n]);
	 }
	private static boolean hasPath(ArrayList<Integer>[] g, int src, int dest, boolean[] vis) 
	{
		if(src==dest)
		{
			return true;
		}
		vis[src]=true;
		for(int i=0;i<g[src].size();i++)
		{
			int e=g[src].get(i);
			if(!vis[e] && hasPath(g,e,dest,vis))
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int [][]e= {{0,1},{0,2},{3,5},{5,4},{4,3}};
		int n=6;
		int src=0;
		int dest=5;
		System.out.println(Path(n,e,src,dest));
	}

}

