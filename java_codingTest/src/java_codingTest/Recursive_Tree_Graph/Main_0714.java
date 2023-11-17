package java_codingTest.Recursive_Tree_Graph;
import java.io.*;
import java.util.*;

public class Main_0714 {
	
	static int[][] graph;
	static int[] answer;
	
	// 문제: 레벨 이용
	public static void bfs(int v, int n) {
		Queue<Integer> q = new LinkedList<>();
		int[] ch = new int[n+1];
		q.offer(v);
		ch[v] = 1;
		int L=0;
		
		while(!q.isEmpty()) {	
			int len = q.size();
			for(int i=0; i<len; i++) {
				int nv = q.poll();		
				for(int j=1; j<=n; j++) {
					if(ch[j] == 0 && graph[nv][j] == 1) {
						ch[j] = 1;
						answer[j] = L+1;
						q.offer(j);
					}
				}
			}
			L++;
		}
	}
	
	// 풀이: 배열(인접행렬) 이용(2차원은 레벨로 하기 힘들어서 배열 주로 사용)
	static List<List<Integer>> graph2;
	static int[] dis, ch;
	public static void bfs2(int v) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(v);
		ch[v] = 1;
		dis[v] = 0;
		
		while(!q.isEmpty()) {	
			int cv = q.poll();
			for(int nv : graph2.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					q.offer(nv);
					dis[nv] = dis[cv]+1;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		graph = new int[n+1][n+1];
		answer = new int[n+1];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a][b] = 1;
		}
		
		bfs(1, n);
		
		for(int i=2; i<=n; i++) sb.append(i + " : " + answer[i] + "\n");
		System.out.println(sb);
		
		
		// 인접리스트 방법
		graph2 = new ArrayList<List<Integer>>();
		ch = new int[n+1];
		dis = new int[n+1];
		
		for(int i=0; i<=n; i++) {
			graph2.add(new ArrayList<Integer>());
		}
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph2.get(a).add(b);
		}
		bfs2(1);
		for(int i=2; i<=n; i++) sb.append(i + " : " + dis[i] + "\n");		
		
		br.close();
		
		return ;	
	}
}
