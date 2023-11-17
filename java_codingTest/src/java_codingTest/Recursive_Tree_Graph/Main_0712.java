package java_codingTest.Recursive_Tree_Graph;
import java.io.*;
import java.util.*;

public class Main_0712 {
	
	static int cnt=0, n;
	static int[][] graph;
	static int[] ch;
	
	public static int dfs(int v) {
		if(v == n) cnt++;
		else {
			for(int i=1; i<=n; i++) {
				if(ch[i] == 0 && graph[v][i] == 1) {
					ch[i] = 1;
					dfs(i);
					ch[i] = 0;
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a][b] = 1;
		}
		
		ch[1] = 1;
		System.out.println(dfs(1));
		br.close();
		
		return ;	
	}
}
