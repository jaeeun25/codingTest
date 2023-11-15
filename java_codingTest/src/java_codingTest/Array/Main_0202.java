package java_codingTest.Array;
import java.io.*;
import java.util.*;

public class Main_0202 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		int max_h = Integer.MIN_VALUE, cnt = 0;
		
		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		for(int h : arr) {
			if(max_h < h) {
				max_h = h;
				cnt++;
			}
		}
		
		System.out.println(cnt);
		br.close();
		
		return ;
		
	}
}
