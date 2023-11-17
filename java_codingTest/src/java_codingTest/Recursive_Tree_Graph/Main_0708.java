package java_codingTest.Recursive_Tree_Graph;
import java.util.*;

public class Main_0708 {

	/*
	// 문제
	public static int bfs(int s, int e) {
		Queue<Integer> q = new LinkedList<>();
		int cnt = 0;
		q.offer(s);
		
		while(!q.isEmpty()) {
			int now = q.poll();
			
			if(now < e) {
				if(e-now < 3) q.offer(now+1);
				else q.offer(now+5);
			}
			else if(now > e) q.offer(now-1);
			else continue;
			cnt++;
		}
		
		return cnt;
	}
	*/
	
	// 풀이
	int answer = 0;
	int[] dis = {1, -1, 5};
	int[] ch;		// 한번 방문한 것은 안넣기 위한 체크 배열
	Queue<Integer> q = new LinkedList<Integer>();
	public int bfs(int s, int e) {
		ch = new int[10001];
		ch[s] = 1;
		q.offer(s);
		int level = 0;
		
		while(!q.isEmpty()) {
			int len = q.size();
			
			for(int i=0; i<len; i++) {
				int x = q.poll();
				//if(x == e) return level;
				
				for(int j=0; j<3; j++) {
					int nx = x+dis[j];				// 자식 노드
					if(nx == e) return level+1;		// 더 효율
					if(nx>=1 && nx<=10000 && ch[nx] == 0) {
						ch[nx] = 1;
						q.offer(nx);
					}
				}
			}
			level++;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		int s = kb.nextInt();
		int e = kb.nextInt();
		
		//System.out.println(bfs(s, e));
		Main_0708 T = new Main_0708();
		System.out.println(T.bfs(s, e));
		
		return ;	
	}
}
