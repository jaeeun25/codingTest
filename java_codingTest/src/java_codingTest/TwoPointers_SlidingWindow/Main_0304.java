package java_codingTest.TwoPointers_SlidingWindow;
import java.io.*;
import java.util.*;

public class Main_0304 {
	
	// 풀이(투포인트 + 슬라이딩윈도우)
	public int solution(int n, int m, int[] arr){
		int answer=0, sum=0, lt=0;
		
		for(int rt=0; rt<n; rt++) {
			sum += arr[rt];
			if(sum == m) answer++;
			while(sum >= m) {
				sum -= arr[lt++];
				if(sum == m) answer++;
			}	
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 문제
		int sum, cnt=0;
		for(int i=0; i<n; i++) {
			sum = 0;
			for(int j=i+1; j<n; j++) {
				sum += arr[j];
				if(sum > m) break;
				else if(sum == m) {
					cnt++;
					break;
				}
			}
		}
		
		System.out.println(cnt);
		br.close();
		
		return ;
	}
}
