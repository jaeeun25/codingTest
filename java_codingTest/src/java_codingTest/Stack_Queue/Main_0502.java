package java_codingTest.Stack_Queue;
import java.io.*;
import java.util.*;

public class Main_0502 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		String str = br.readLine();
		String answer = "";
		
		/*
		// 문제
		for(char c : str.toCharArray()) {	
			if(c == '(') stack.push(c);
			else if(c == ')') stack.pop();
			else if(stack.isEmpty()) answer += c;
		}
		*/
		
		// 풀이
		for(char c : str.toCharArray()) {	
			if(c != ')') stack.push(c);
			else {
				while(stack.pop() != '(');
			}
		}	
		
		for(int i=0; i<stack.size(); i++) {
			answer += stack.get(i);
		}
		
		System.out.println(answer);
		br.close();
		
		return ;	
	}
}
