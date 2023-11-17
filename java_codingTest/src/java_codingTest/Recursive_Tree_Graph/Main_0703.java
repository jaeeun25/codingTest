package java_codingTest.Recursive_Tree_Graph;
import java.util.*;

public class Main_0703 {
	public static int dfs(int n) {
		if(n==1) return 1;
		else {
			return n*dfs(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		System.out.println(dfs(n));
		
		return ;	
	}
}
