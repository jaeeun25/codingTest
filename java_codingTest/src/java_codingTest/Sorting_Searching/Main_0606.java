package java_codingTest.Sorting_Searching;
import java.io.*;
import java.util.*;

public class Main_0606 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		// 문제
		StringBuilder sb = new StringBuilder();
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		for(int i=0; i<n; i++) {
			if(tmp[i] != arr[i]) sb.append((i+1)+" ");
		}
		
		System.out.println(sb);
		br.close();
		
		return ;	
	}
}
