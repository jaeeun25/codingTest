package java_codingTest.Recursive_Tree_Graph;
import java.util.*;

public class Main_0701 {
	public static void dfs(int n) {
		if(n == 0) return;
		else{
			//System.out.print(n + " ");	// 3 2 1 출력
			dfs(n-1);
			System.out.print(n + " ");		// 1 2 3 출력
		}
	}
	
	public static void main( String[] args){
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		dfs(n);
		
		return ;	
	}
}
