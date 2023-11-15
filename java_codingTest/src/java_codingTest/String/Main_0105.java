package java_codingTest.String;
import java.io.*;

public class Main_0105 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] str = br.readLine().toCharArray();
		int lt = 0, rt = str.length-1;
		
		while(lt < rt) {
			if(!Character.isAlphabetic(str[lt])) lt++;
			else if(!Character.isAlphabetic(str[rt])) rt--;
			else {
				char tmp = str[lt];
				str[lt] = str[rt];
				str[rt] = tmp;
				lt++;
				rt--;
			}
		}
		
		System.out.println(String.valueOf(str));
		
		br.close();
		
		return ;
	}
}