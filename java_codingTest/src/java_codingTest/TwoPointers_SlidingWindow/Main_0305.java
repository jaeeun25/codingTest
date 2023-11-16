package java_codingTest.TwoPointers_SlidingWindow;
import java.io.*;
import java.util.*;

public class Main_0305 {
	
	// 풀이(투포인트)
	public int solution(int n){
		int answer=0, sum=0, lt=0;
		int m = n/2+1;
		int[] arr = new int[m];
		
		for(int i=0; i<m; i++) arr[i] = i+1;
		
		for(int rt=0; rt<m; rt++) {
			sum += arr[rt];
			if(sum == n) answer++;
			while(sum >= n) {
				sum -= arr[lt++];
				if(sum == n) answer++;
			}
		}
		
		return answer;
	}
	
	// 풀이(수학적인 방법(몫과 나머지))
	public int solution2(int n){
		int answer=0, cnt=1;
		n--;
		while(n>0) {
			cnt++;			// cnt는 연속된 자연수의 개수
			n=n-cnt;		// n이 15인 경우 -1-2로 12가 됨
			if(n%cnt==0) answer++;
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int n = Integer.parseInt(br.readLine());
		int answer=0, sum=1, lt=1;
		
		// 문제
		for(int rt=2; rt<=n/2+1; rt++) {
			sum += rt;
			if(sum == n) {
				answer++;
			}
			while(sum >= n) {
				sum -= lt;
				lt++;
				if(sum == n) answer++;
			}
		}
		
		System.out.println(answer);
		br.close();
		
		return ;
	}
}
