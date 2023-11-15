package java_codingTest.String;
import java.io.*;
import java.util.*;

public class Main_0107 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] str = br.readLine().toUpperCase().toCharArray();
		int lt = 0, rt = str.length-1;
		String answer = "YES";
		
		while(lt < rt) {
			if(str[lt] != str[rt]) {
				answer = "NO";
				break;
			}
			lt++;
			rt--;
		}
		
		// for문으로
		String str2 = br.readLine().toUpperCase();
		int len = str2.length();
		
		for(int i=0; i<len/2; i++) {
			if(str2.charAt(i) != str2.charAt(len-i-1)) {
				answer = "NO";
				break;
			}
		}
		
		// StringBuilder.reverse() + .equalsIgnoreCase() 사용
		String tmp = new StringBuilder(str2).reverse().toString();
		if(!str2.equalsIgnoreCase(tmp)) answer = "NO";
		
		System.out.println(answer);
		br.close();
		
		return ;
	}
}
