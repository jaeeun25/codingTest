package java_codingTest.Stack_Queue;
import java.io.*;
import java.util.*;

public class Main_0505 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] arr = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		//Stack<Integer> pipe = new Stack<>();
		
		// 문제
		int answer = 0;
		for(int i=0; i<str.length(); i++) {
			if(arr[i] == '(') {
				stack.push(arr[i]);
				//pipe.push(1);
			}
			else {
				stack.pop();
				/*
				if(arr[i-1] == '(') {
					pipe.pop();
					for(int j=0; j<pipe.size(); j++) pipe.set(j, pipe.get(j)+1);
				}
				else {
					answer += pipe.pop();
				}
				*/
				
				// 풀이
				if(arr[i-1] == '(') answer += stack.size();
				else answer += 1;
			}
		}
		
		System.out.println(answer);		
		br.close();
		
		return ;	
	}
}
