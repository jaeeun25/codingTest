package java_codingTest.Stack_Queue;
import java.io.*;
import java.util.*;

public class Main_0507 {
	
	public String solution(String need, String plan) {
		String answer = "YES";
		Queue<Character> q = new LinkedList<>();
		for(char c : need.toCharArray()) q.offer(c);
		
		for(char x : plan.toCharArray()) {
			if(q.contains(x)) {
				if(x != q.poll()) return "NO";
			}
		}
		if(!q.isEmpty()) return "NO";
	
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		
		Queue<Character> q = new LinkedList<>();
		for(char c : s1.toCharArray()) q.offer(c);
		
		String answer = "YES";
		int cnt = 0;
		char target = q.poll();
		for(char c : s2.toCharArray()) {
			if(cnt == s1.length()) break;
			else{
				if(c == target) {
					cnt++;
					if(cnt < s1.length()) target = q.poll();
				}
			}
		}
		if(cnt != s1.length()) answer = "NO";
		
		System.out.println(answer);
		br.close();
		
		return ;	
	}
}
