package java_codingTest.Array;
import java.io.*;
import java.util.*;

public class Main_0207 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0, score = 1;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for(int i=0; i<n; i++) {
			int flag = Integer.parseInt(st.nextToken());
			if(flag == 1) {
				sum += score;
				score++;
			}
			else {
				score = 1;
			}
		}
		
		System.out.println(sum);
		
		br.close();
		
		return ;
	}
}
