package java_codingTest.Array;
import java.io.*;
import java.util.*;

public class Main_0212 {
	
	// 풀이
	public int solution(int n, int m, int[][] arr) {
		int answer = 0;
		for(int i=1; i<=n; i++) {					// 학생 번호
			for(int j=1; j<=n; j++) {				// 학생 번호
				int cnt = 0;
				for(int k=0; k<m; k++) {			// 문제 번호
					int pi=0, pj=0;
					for(int s=0; s<n; s++) {		// 등수
						if(arr[k][s] == i) pi = s;	// k문제에서 i번 학생 등수
						if(arr[k][s] == j) pj = s;	// k문제에서 j번 학생 등수
					}
					if(pi<pj) cnt++;
				}
				if(cnt==m) answer++;				// 모든 테스트 통과
			}
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean[][] arr = new boolean[n+1][n+1];
		int[][] score = new int[m][n];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<n; j++) {
				score[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 문제
		int x, y, cnt = n*(n-1);
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				x = score[i][j];
				for(int k=j+1; k<n; k++) {
					y = score[i][k];
					if(arr[x][y]) continue;
					arr[x][y] = true;
					cnt--;
				}
			}
		}
		
		System.out.println(cnt);
		br.close();
		
		return ;
		
	}
}
