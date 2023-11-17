package java_codingTest.Sorting_Searching;
import java.io.*;
import java.util.StringTokenizer;

public class Main_0601 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr= new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 문제: 선택정렬
		int idx;
		for(int i=0; i<n-1; i++) {
			idx=i;
			for(int j=i+1; j<n; j++) {
				if(arr[idx] > arr[j]) idx = j;
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i : arr) {
			sb.append(i + " ");
		}
		
		System.out.println(sb);
		br.close();
		
		return ;	
	}
}
