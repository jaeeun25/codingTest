package java_codingTest.Recursive_Tree_Graph;

import java.util.Scanner;

public class Main_0706 {
	static int n;
	static int[] ch;
	public static void dfs(int L) {
		if(L == n+1) {
			String tmp = "";
			for(int i=1; i<=n; i++) {
				if(ch[i]==1) tmp+= i + " ";
			}
			if(tmp.length() > 0) System.out.println(tmp);	// 공집합이 아니면 출력
		}
		else {
			ch[L] = 1;
			dfs(L+1);		// 해당 원소 사용
			
			ch[L] = 0;
			dfs(L+1);		// 해당 원소 미사용
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		ch = new int[n+1];		// 인덱스 번호를 원소 번호로 생각
		dfs(1);
		
		return ;	
	}
}
