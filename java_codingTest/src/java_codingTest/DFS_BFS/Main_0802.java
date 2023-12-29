package java_codingTest.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_0802 {

	static int n, c;
	static int answer = Integer.MIN_VALUE;
	
	public static void dfs(int[] arr, int sum, int L) {
		if(sum <= c) {
			if(answer < sum) answer = sum;
		}
		if(L == n) return;
		else {
			
			dfs(arr, sum+arr[L], L+1);
			dfs(arr, sum, L+1);
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		c = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());
		
		dfs(arr, 0, 0);
		
		System.out.println(answer);
		
		return ;	
	}
}
