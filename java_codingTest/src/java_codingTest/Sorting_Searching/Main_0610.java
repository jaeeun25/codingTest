package java_codingTest.Sorting_Searching;
import java.io.*;
import java.util.*;

public class Main_0610 {

	public static int count(int d, int[] arr) {		// 답이 유효한지 체크
		int cnt = 1, ep = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]-ep >= d) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		// 풀이
		Arrays.sort(arr);
		
		int answer = 0;
		int lt = 1;
		int rt = arr[n-1]-arr[0];
		
		while(lt <= rt) {
			int mid = (lt+rt)/2;
			if(count(mid, arr) >= c) {
				answer = mid;
				lt = mid+1;
			}
			else rt = mid-1;
		}
		
		
		System.out.println(answer);
		br.close();
		
		return ;	
	}
}
