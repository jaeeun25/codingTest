package java_codingTest.String;
import java.io.*;
import java.util.*;

public class Main_0106 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String answer = "";
		
		/*
		// set 이용
		char[] str = br.readLine().toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		
		for(char c : str) {
			set.add(c);
		}
		
		for(char c: set) {
			answer += c;
		}
		*/
		
		// indexOf 이용
		String str = br.readLine();
		for(int i=0; i<str.length(); i++) {
			if(i == str.indexOf(str.charAt(i))) {	// 인덱스는 가장 처음 나온 인덱스를 리턴하기 때문에 i와 인덱스 번호가 다르면 이미 앞에서 나온 것으로 중복된 것
				answer += str.charAt(i);
			}
		}
		
		System.out.println(answer);
		
		br.close();
		
		return ;
	}
}
