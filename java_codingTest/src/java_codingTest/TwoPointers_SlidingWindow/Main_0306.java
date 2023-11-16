package java_codingTest.TwoPointers_SlidingWindow;
import java.io.*;
import java.util.*;

public class Main_0306 {
	
	// 풀이
	public int solution(int n, int k, int[] arr){
		int answer=0, cnt=0, lt=0;
		
		for(int rt=0; rt<n; rt++) {
			if(arr[rt] == 0) cnt++;
			while(cnt > k) {			// rt-lt+1 계산 전에 체크
				if(arr[lt] == 0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 문제
		int lt=0, max=Integer.MIN_VALUE;
		List<Integer> zero = new ArrayList<>();
		
		for(int rt=0; rt<n; rt++) {
			if(arr[rt] == 0) {
				zero.add(rt);
				if(zero.size() > k){
					max = Math.max(rt-lt, max);
					while(zero.get(0) > lt) {
						lt++;
					}
					zero.remove(0);
					lt++;
				}
			}
		}
		
		System.out.println(max);
		
		return ;
	}
}
