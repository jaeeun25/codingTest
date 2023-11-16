package java_codingTest.HashMap_TreeSet;
import java.io.*;
import java.util.*;

public class Main_0405 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] card = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		// 문제
		Set<Integer> ts = new TreeSet<>(Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {		// i<n-2
			for(int j=i+1; j<n; j++) {	// j<n-1 이면 더 효율적이긴 함
				for(int s=j+1; s<n; s++) {
					ts.add(card[i] + card[j] + card[s]);
				}
			}
		}
		
		Iterator<Integer> it = ts.iterator();
		int answer = -1, cnt = 1, sum = 0;
		while(it.hasNext()) {
			sum = it.next();
			if(cnt==k) {
				answer = sum;
				break;
			}
			cnt++;
		}
		
		/*
		// 출력 다른 방법
		for(int x : ts) {
			if(cnt==k) {
				answer = x;
				break;
			}
			cnt++;
		}
		*/
		
		System.out.println(answer);
		br.close();
		
		return ;
	}
}
