package java_codingTest.String;
import java.io.*;
import java.util.*;

public class Main_0110 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String str = st.nextToken();
		char t = st.nextToken().charAt(0);
		int[] answer = new int[str.length()];	
		
		// 왼쪽 문자 기준
		int p = 1000;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == t) p = 0;
			else p++;

			answer[i] = p;
		}
		
		// 오른쪽 문자 기준
		p = 1000;
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i) == t) p = 0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p);
				// if(answer[i] > p) answer[i] = p;
			}
		}
		
		String result = "";
		for(int i=0; i<answer.length; i++) {
			if(i==0) result += answer[i];
			else result += " " + answer[i];
		}
		
		System.out.println(result);
		
		br.close();
		
		return ;
		
	}
}
