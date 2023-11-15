package java_codingTest.Array;
import java.io.*;
import java.util.*;

public class Main_0211 {
	
	// 풀이
	public int solution(int n, int[][] arr) {	// arr[n+1][6]
		int answer=0, max = Integer.MIN_VALUE;
		
		for(int i=1; i<=n; i++) {			// 학생 번호
			int cnt = 0;
			for(int j=1; j<=n; j++) {		// 비교 학생 번호
				for(int k=1; k<=5; k++) {	// 학년
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;	// 또 같은 학생끼리 같은 반 일때 count하면 안되므로
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i;
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][5];
		StringTokenizer st;
		List<Set<Integer>> answer = new ArrayList<Set<Integer>>();
		
		// 표 세팅
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
			answer.add(i, new HashSet<Integer>());
		}
		
		// 반장 구하기
		int max = Integer.MIN_VALUE;
		int num = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<5; j++) {
				for(int k=i+1; k<n; k++) {
					if(arr[i][j] == arr[k][j]) {
						answer.get(i).add(k+1);
						answer.get(k).add(i+1);
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			if(max < answer.get(i).size()) {
				max = answer.get(i).size();
				num = i+1;
			}
		}
		
		System.out.println(num);
		br.close();
		
		return ;
		
	}
}
