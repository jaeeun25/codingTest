package java_codingTest.Recursive_Tree_Graph;
import java.util.*;

public class Main_0704 {
	public static void dfs(int[] arr, int i, int n) {
		System.out.print(arr[i++] + " ");
		
		if(i == n) return ;
		else {
			if(i>1)arr[i] = arr[i-2]+arr[i-1];
			dfs(arr, i, n);
		}
	}
	
	// 풀이(출력은 main에서 for문으로 돌려야함)
	static int[] fibo;		// 효율성 올리기 위한 방법
	public static int dfs2(int n) {		
		/*
		if(n==1) return 1;
		else if(n==2) return 1;
		else return dfs2(n-2) + dfs2(n-1);
		*/
		if(fibo[n]>0) return fibo[n];// 메모리제이션(더 효율!)
		if(n==1) return fibo[n]=1;
		else if(n==2) return fibo[n]=1;
		else return fibo[n]=dfs2(n-2) + dfs2(n-1);
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arr = new int[n];
		arr[0] = arr[1] = 1;
		dfs(arr, 0, n);
		
		// 풀이
		//for(int i=1; i<=n; i++) System.out.println(dfs2(i)+" ");
		fibo = new int[n+1];
		dfs2(n);
		for(int i=1; i<=n; i++) System.out.println(fibo[i]+" ");
		
		
		return ;	
	}
}
