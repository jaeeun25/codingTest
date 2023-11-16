package java_codingTest.Stack_Queue;
import java.io.*;
import java.util.*;

public class Main_0503 {
	
	// 풀이
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int pos : moves) {
			for(int i=0; i<board.length; i++) {
				if(board[i][pos-1] !=0) {
					int tmp = board[i][pos-1];
					board[i][pos-1] = 0;		// 인형 가져옴
					if(!stack.isEmpty() && stack.peek() == tmp) {
						answer += 2;
						stack.pop();
					}
					else stack.push(tmp);
					break;
				}
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] board = new int[n+1][n+1];
		int[] row = new int[n+1];
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1; j<=n; j++) {
				int num = Integer.parseInt(st.nextToken());
				board[i][j] = num;
				if(num != 0 && row[j] == 0) row[j] = i; 
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		int[] moves = new int[m];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<m; i++) {
			moves[i] = Integer.parseInt(st.nextToken());
		}
		
		// 문제
		Stack<Integer> stack = new Stack<>();
		int item, answer=0;
		
		for(int i : moves) {
			item = board[row[i]][i];
			if(item == 0) continue;
			
			if(!stack.isEmpty() && stack.peek() == item) {
				stack.pop();
				answer++;
			}
			else stack.push(item);
			
			row[i] = row[i] >= n ? 0 : row[i]+1;
		}
		
		System.out.println(answer*2);
		br.close();
		return ;	
	}
}
