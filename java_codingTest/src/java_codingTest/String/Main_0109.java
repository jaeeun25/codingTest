package java_codingTest.String;
import java.io.*;

public class Main_0109 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		
		// 정규식 사용
		String str = br.readLine().replaceAll("[^0-9]", "");
		answer = Integer.parseInt(str);
		
		
		// 아스키 코드 이용
		String s = br.readLine();
		for(char x : s.toCharArray()) {
			if(x >= 48 && x <= 57) {
				answer = answer * 10 + (x-48);
			}
		}
		
		// Character.isDigit(x) 사용
		String answer2 = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) {
				answer2 += x;
			}
		}
		System.out.println(Integer.parseInt(answer2));
		
		System.out.println(answer);
		br.close();
		
		return ;
		
	}
}
