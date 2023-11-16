package java_codingTest.Stack_Queue;
import java.util.*;
import java.io.*;

class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}
public class Main_0508 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String[] str = br.readLine().split(" ");
		
		// 문제
		int answer=0;	
		Queue<Person> q = new LinkedList<>();
		for(int i=0; i<n; i++) q.offer(new Person(i, Integer.parseInt(str[i])));

		while(!q.isEmpty()) { 
			Person tmp = q.poll();
			
			for(Person x : q) {
				if(x.priority > tmp.priority) {
					q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp != null) {
				answer++;
				if(tmp.id == m) System.out.println(answer);
			}
		}
		
		br.close();
		
		return ;	
	}
}
