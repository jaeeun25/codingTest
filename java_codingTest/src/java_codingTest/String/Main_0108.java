package java_codingTest.String;
import java.io.*;

public class Main_0108 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] str = br.readLine().toUpperCase().toCharArray();
		int lt = 0, rt = str.length-1;
		String answer = "YES";
		
		while(lt < rt) {
			if(!Character.isAlphabetic(str[lt])) lt++;
			else if(!Character.isAlphabetic(str[rt])) rt--;
			else if(str[lt] != str[rt]){
				answer = "NO";
				break;
			}
			else {
				lt++;
				rt--;
			}
		}		
		
		// replaceAll() + 정규식 이용
		String s = br.readLine().toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(s).reverse().toString();
		
		if(!s.equals(tmp)) answer = "NO";
		
		System.out.println(answer);
		
		br.close();
		
		return ;
		
	}
}
