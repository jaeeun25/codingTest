package java_codingTest.Sorting_Searching;
import java.io.*;
import java.util.StringTokenizer;

public class Main_0603 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr= new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 문제: 삽입정렬
		int tmp, j;
		for(int i=1; i<n; i++) {
			tmp = arr[i];
			for(j=i-1; j>=0; j--) {
				if(arr[j] > tmp) arr[j+1] = arr[j];
				else break;
			}
			arr[j+1] = tmp;
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
