package java_codingTest.Sorting_Searching;
import java.io.*;
import java.util.StringTokenizer;

public class Main_0602 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr= new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 문제: 버블정렬
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
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
