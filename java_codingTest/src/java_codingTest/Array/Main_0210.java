package java_codingTest.Array;
import java.io.*;
import java.util.*;

public class Main_0210 {
	
	//풀이
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, -1, 0, 1};
	public int solution(int n, int[][] arr) {
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag = true;
				for(int k=0; k<4; k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					
					// 경계선 유의
					if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag) answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n+2][n+2];
		StringTokenizer st;
		
		// 격자판 세팅
		for(int i=1; i<n+1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1; j<n+1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 봉우리 찾기
		int cnt = 0;
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<n+1; j++) {
				int target = arr[i][j];
				
				if((target > arr[i-1][j]) && (target > arr[i+1][j]) &&
						(target > arr[i][j-1]) && (target > arr[i][j+1])) cnt++; 
			}
		}
		
		System.out.println(cnt);
		br.close();
		
		return ;
		
	}
}
