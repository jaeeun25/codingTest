package java_codingTest.Array;
import java.io.*;
import java.util.*;

public class Main_0208 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] answer = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());	
			answer[i] = n;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					answer[i] -= 1;
				}
				else if(arr[i] < arr[j]) {
					answer[j] -= 1;
				}
				else if(arr[i] == arr[j]) {
					answer[i] -= 1;
					answer[j] -= 1;
				}
			}
		}
		
		/*
		// 풀이
		for(int i=0; i<n; i++) {
			int cnt = 1;
			for(int j=0; j<n; j++) {
				if(arr[j] > arr[i]) cnt++;
			}
			answer[i] = cnt;
		}
		*/
		
		for(int s : answer) {
			System.out.print(s + " ");
		}
		
		br.close();
		
		return ;
		
	}
}
