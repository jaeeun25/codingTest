package java_codingTest.String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0103 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* 
		// split
		String[] str = br.readLine().split(" ");
		String answer = "";
		int size = 0;
		
		for(String s : str) {
			if(size < s.length()) {
				answer = s;
				size = s.length();
			}
		}
		*/
		
		// indexOf + substring
		String str = br.readLine();
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		
		while((pos = str.indexOf(' ')) != -1) {	// 띄어쓰기 발견 안될때까지 반복
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			
			if(len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);		// 자른거 str에서 제외
		}
		
		if(str.length() > m) answer = str;	// 마지막 단어는 공백이 없기때문에 따로 처리
		
		System.out.println(answer);
		br.close();
		
		return ;
		
	}
}
