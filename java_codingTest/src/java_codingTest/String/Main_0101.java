package java_codingTest.String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_0101 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] str = br.readLine().toUpperCase().toCharArray();
		char c = br.readLine().toUpperCase().charAt(0);
		int cnt = 0;
		
		for(char s : str) {
			if(s == c) cnt++;
		}
		
		System.out.println(cnt);
		
		br.close();
		return ;
	}
}
