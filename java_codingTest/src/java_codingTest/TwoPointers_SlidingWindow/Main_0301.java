package java_codingTest.TwoPointers_SlidingWindow;
import java.io.*;
import java.util.*;

public class Main_0301 {
	
	// 풀이(투 포인터)
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		int p1=0, p2=0;
		
		while(p1<n && p2<m) {
			if(a[p1] < b[p2]) 
				answer.add(a[p1++]);
			else 
				answer.add(b[p2++]);
		}
		while(p1<n) answer.add(a[p1++]);
		while(p2<m) answer.add(b[p2++]);
		
		return answer;
	}
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] n_arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) 
			n_arr[i] = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		int[] m_arr = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) 
			m_arr[i] = Integer.parseInt(st.nextToken());
		
		int[] answer = new int[n+m];
		
		// 문제
		int np = 0, mp = 0;
		for(int i=0; i<n+m; i++) {
			if(mp >= m || (np < n && n_arr[np] <= m_arr[mp]))
				answer[i] = n_arr[np++];
			else if(np >= n || (mp < m && n_arr[np] > m_arr[mp]))
				answer[i] = m_arr[mp++];	
		}
		
		StringBuilder sb = new StringBuilder();
		for(int num : answer) {
			sb.append(num + " ");
		}
		
		System.out.println(sb);
		br.close();
		
		return ;
	}
}
