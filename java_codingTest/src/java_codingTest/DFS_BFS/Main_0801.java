package java_codingTest.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_0801 {
	static int n, total = 0;
	static String answer = "NO";
	static boolean flag = false;

	public static void dfs(int[] arr, int sum, int L) {
		if(flag) return;
		if(sum > total/2) return;	
		if(L==n) {
			if((total-sum) == sum) {
				answer="YES";
				flag = true;
			}
		}
		else {
			dfs(arr, sum+arr[L], L+1);
			dfs(arr, sum, L+1);
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			total += arr[i];
		}
		
		dfs(arr, 0, 0);
		
		System.out.println(answer);
		return ;	
	}
}
