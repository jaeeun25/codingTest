package java_codingTest.Sorting_Searching;
import java.util.*;
import java.io.*;

public class Main_0604 {
	
	// 풀이
	public int[] solution(int size, int n, int[] arr) {
		int[] cache = new int[size];
		
		for(int x : arr) {
			int pos = -1;	// 인덱스번호, 위치
			for(int i=0; i<size; i++) {
				if(x == cache[i]) pos = i;
			}
			
			if(pos == -1) {	// 미스
				for(int i=size-1; i>=1; i++) {
					cache[i] = cache[i-1];
				}
			}
			else {	// 히트
				for(int i=pos; i>=1; i++) {
					cache[i] = cache[i-1];
				}
			}
			cache[0] = x;
		}
		
		return cache;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int s = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		List<Integer> answer = new ArrayList<>();
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		// 문제
		int num;
		for(int i=0; i<n; i++) {
			num = arr[i];
			if(!answer.contains(num)) {
				if(answer.size() < s) answer.add(0, arr[i]);
				else {
					answer.remove(s-1);
					answer.add(0, num);
				}
			}
			else {
				answer.remove(Integer.valueOf(num));	// int로 넘기면 index로 처리
				answer.add(0, num);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int x : answer) sb.append(x + " ");
		
		System.out.println(sb);
		br.close();
		
		return ;	
	}
}
