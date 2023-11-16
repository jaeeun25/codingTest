package java_codingTest.TwoPointers_SlidingWindow;
import java.io.*;
import java.util.*;

public class Main_0302 {
	
	// 풀이(투 포인터)
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer = new ArrayList<>();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int p1=0, p2=0;
		while(p1<n && p2<m) {
			if(a[p1] == b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}
			else if(a[p1] < b[p2]) p1++;
			else p2++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] n_arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++)
			n_arr[i] = Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		int[] m_arr = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++)
			m_arr[i] = Integer.parseInt(st.nextToken());
		
		// 문제
		Arrays.sort(n_arr);
		Arrays.sort(m_arr);
		StringBuilder sb = new StringBuilder();
		int np=0, mp=0;
		
		while(np < n && mp <m) {
			if(n_arr[np] < m_arr[mp]) np++;
			else if(n_arr[np] > m_arr[mp]) mp++;
			else {
				sb.append(n_arr[np++]+" ");
				mp++;
			}
		}
		
		System.out.println(sb);
		br.close();
		
		return ;
	}
}
