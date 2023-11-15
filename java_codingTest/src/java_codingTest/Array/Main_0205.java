package java_codingTest.Array;
import java.util.*;

public class Main_0205 {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int cnt = 0;
		boolean[] prime = new boolean[n+1];
		
		/* 노션에 적은 에라토스테네스 체 보고 풀이 
		prime[0] = prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(n+1); i++) {
			if(prime[i]) continue;
			for(int j=i*i; j<n+1; j+=i) {
				prime[j] = true;
			}
		}
		
		for(boolean b : prime) { 
			if(!b) cnt++; 
		}
		*/
		
		// 강의 에라토스테네스 체 보고 풀이
		for(int i=2; i<=n; i++) {
			if(!prime[i]) {
				cnt++;
				for(int j=i; j<=n; j+=i) {
					prime[j] = true;
				}
			}
		}

		System.out.println(cnt);
		
		return ;
		
	}
}
