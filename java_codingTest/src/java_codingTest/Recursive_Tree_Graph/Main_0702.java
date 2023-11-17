package java_codingTest.Recursive_Tree_Graph;
import java.util.*;

public class Main_0702 {
	
	public static void dfs(int n) {
		if(n == 0) return;
		else {
			dfs(n/2);
			System.out.print(n%2);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		dfs(n);
		
		return ;	
	}
}
