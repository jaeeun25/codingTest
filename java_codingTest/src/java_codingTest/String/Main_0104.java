package java_codingTest.String;
import java.io.*;

public class Main_0104 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		/*
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			String answer = "";
			for(int j=str.length()-1; j>=0; j--) {
				answer += str.charAt(j);
			}
			
			System.out.println(answer);
		}
		*/
		
		// StringBuilder 이용
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			String answer = new StringBuilder(str).reverse().toString();
			
			System.out.println(answer);
		}
		
		// lt, rt 이용
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			char[] c = str.toCharArray();
			int lt = 0, rt = str.length()-1;
			
			while(lt < rt) {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
			
			String answer = String.valueOf(c);
			
			System.out.println(answer);
		}
		
		
		br.close();
		
		return ;
		
	}
}
