package java_codingTest.Array;
import java.io.*;

public class Main_0204 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String answer = "";
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		arr[0] = arr[1] = 1;
		
		for(int i=2; i<n; i++) {
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		for(int num : arr) {
			answer += num + " ";
		}
		
		/*
		// 배열 안쓰고 풀기
		int a=1, b=1, c;
		System.out.println(a+" "+b+" ");
		for(int i=2; i<n; i++) {
			c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
		*/
		
		System.out.println(answer);
		br.close();
		
		return ;
		
	}
}
