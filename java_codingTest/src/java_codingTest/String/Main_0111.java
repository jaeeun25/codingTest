package java_codingTest.String;
import java.io.*;

public class Main_0111 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 빈문자 추가해서 탐색 시 에러 안나게
		String str = br.readLine() + " ";
		String answer = "";
		int cnt = 1;
		
		System.out.println(str);
		
		for(int i=0; i<str.length()-1; i++) {
			
			if(str.charAt(i) == str.charAt(i+1)) {
				cnt++;
			}
			else {
				answer += str.charAt(i);
				if(cnt > 1) answer += String.valueOf(cnt);
				cnt = 1;
			}
		}
		
		System.out.println(answer);
		br.close();
		
		return ;
		
	}
}
