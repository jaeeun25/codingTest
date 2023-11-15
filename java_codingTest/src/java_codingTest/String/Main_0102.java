package java_codingTest.String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0102 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] str = br.readLine().toCharArray();
		String answer = "";
		
		// 아스키코드
		for(char c: str) { 
			if(c >= 65 && c <= 90) c += 32;
			else c -= 32;
			answer += (char) c;
		}
		
		// Character 사용
		for(char x : str) {
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}
		
		System.out.println(answer);
	
		//System.out.println((char)65);
		//System.out.println((char)90);
		//System.out.println((char)97);
		//System.out.println((char)122);
		
		br.close();
		return ;
	}
}
