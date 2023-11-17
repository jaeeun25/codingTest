package java_codingTest.Recursive_Tree_Graph;
import java.io.*;
import java.util.*;

public class Main_0713 {
	
	static List<List<Integer>> graph;
	static int[] ch;
	static int cnt=0, n;
	
	public static void dfs(int v) {
		if(v == n) cnt++;
		else {
			for(int nv : graph.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					dfs(nv);
					ch[nv] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		graph = new ArrayList<List<Integer>>();
		ch = new int[n+1];
		
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph.get(a).add(b);
		}
		ch[1] = 1;
		dfs(1);
		
		System.out.println(cnt);	
		br.close();
		
		return ;	
	}
}
