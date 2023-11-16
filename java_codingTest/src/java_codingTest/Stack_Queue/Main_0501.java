package java_codingTest.Stack_Queue;
import java.io.*;
import java.util.*;

public class Main_0501 {
	
	// 풀이
	public String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(c == '(') stack.push(c);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		String str = br.readLine();
		String answer = "NO";
		
		for(char c : str.toCharArray()) {
			if(!stack.isEmpty()) {
				if(stack.peek() == '(' && c == ')') {
					stack.pop();
					continue;
				}
			}
			stack.push(c);
		}
		if(stack.isEmpty()) answer="YES";
		
		System.out.println(answer);
		br.close();
		
		return ;	
	}
}
