package java_codingTest.TwoPointers_SlidingWindow;
import java.io.*;
import java.util.*;

public class Main_0303 {
	
	// 풀이(슬라이딩 윈도우)
	public int solution(int n, int k, int[] arr) {
		int answer=0, sum=0;
		for(int i=0; i<k; i++) sum += arr[i];		// 윈도우 생성
		answer = sum;
		
		for(int i=k; i<n; i++) {
			sum += (arr[i] - arr[i-k]);
			answer = Math.max(answer, sum);
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
		int sum, max=Integer.MIN_VALUE;
		for(int i=0; i<n-k+1; i++) {
			sum = 0;
			for(int j=i; j<i+k; j++) {
				sum += arr[j];
			}
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
		
		return ;
	}
}
