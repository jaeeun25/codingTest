package java_codingTest.Stack_Queue;
import java.util.*;

public class Main_0506 {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int n = kb.nextInt();
		int k = kb.nextInt();
		
		for(int i=1; i<=n; i++) q.offer(i);
		
		// 문제
		int cnt = 1;
		while(q.size() > 1) {
			if(cnt == k) {
				q.poll();
				cnt=1;
			}
			else {
				q.offer(q.poll());
				cnt++;
			}
		}
		
		/*
		//풀이
		int answer;
		while(!q.isEmpty()) {
			for(int i=1; i<k; i++) q.offer(q.poll());
			q.poll();
			if(q.size() == 1) answer = q.poll();
		}
		*/
		
		System.out.println(q.poll());
		
		return ;	
	}
}
