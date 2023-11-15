package java_codingTest.Array;
import java.io.*;
import java.util.*;

public class Main_0209 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		int row, col, lt = 0, rt = 0, row_max = Integer.MIN_VALUE, col_max = Integer.MIN_VALUE;
		StringTokenizer st;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<n; i++) {
			row = col = 0;
			for(int j=0; j<n; j++) {
				row += arr[i][j];
				col += arr[j][i];
				
				if(i == j) lt += arr[i][j];
				if(i+j == (n-1)) rt += arr[i][j];				
			}
			row_max = Math.max(row_max, row);
			col_max = Math.max(col_max, col);
		}
	
		/*
		// 풀이
		int sum1, sum2;
		int answer1 = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			sum1 = sum2 = 0;
			for(int j=0; j<n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer1 = Math.max(answer1, sum1);
			answer1 = Math.max(answer1, sum2);
		}
		
		sum1 = sum2 = 0;
		for(int i=0; i<n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n-i-1];
		}
		answer1 = Math.max(answer1, sum1);
		answer1 = Math.max(answer1, sum2);		
		*/
		
		int answer = Math.max(Math.max(lt, rt), Math.max(col_max, row_max));
		System.out.println(answer);
		br.close();
		
		return ;
		
	}
}
