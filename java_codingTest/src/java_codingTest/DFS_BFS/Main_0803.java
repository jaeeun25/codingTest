package java_codingTest.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_0803 {

	static int n, m;
	static int answer = Integer.MIN_VALUE;
	
	public static void dfs(int[][] arr, int score, int time, int L) {
		if(time <= m) {
			if(answer < score) answer = score;
		}
		if(L == n) return;
		else {
			dfs(arr, score+arr[L][0], time+arr[L][1], L+1);
			dfs(arr, score, time, L+1);
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());		// 문제 개수
		m = Integer.parseInt(st.nextToken());		// 제한시간		
		int[][] arr = new int[n][2];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());	// 점수
			arr[i][1] = Integer.parseInt(st.nextToken());	// 걸리는 시간
		}
		
		dfs(arr, 0, 0, 0);
		
		System.out.println(answer);
		
		return ;	
	}
}
