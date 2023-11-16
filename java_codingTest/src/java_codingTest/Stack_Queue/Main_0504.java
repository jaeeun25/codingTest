package java_codingTest.Stack_Queue;
import java.io.*;
import java.util.*;

public class Main_0504 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Integer> stack = new Stack<>();
		
		// 문제
		int x, y, result=0;
		for(char c : str.toCharArray()) {
			if(c >= 49 && c <= 57) {	// Character.isDigit(c)로도 가능
				stack.push(c-'0');
			}
			else {
				x = stack.pop();
				y = stack.pop();
				
				if(c=='+') result = y+x;
				else if(c=='-') result = y-x;
				else if(c=='*') result = y*x;
				else result = y/x;
				
				stack.push(result);
			}
		}
		
		System.out.println(stack.pop());
		br.close();
		
		return ;	
	}
}
