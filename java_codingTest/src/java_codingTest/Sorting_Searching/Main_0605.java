package java_codingTest.Sorting_Searching;
import java.io.*;
import java.util.*;

public class Main_0605 {
	
	// 풀이(정렬로도 풀 수 있음)
	public String solution(int n, int[] arr) {
		String answer = "U";
		
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			if(arr[i] == arr[i+1]) return "D";
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		// 문제
		Map<Integer, Boolean> m = new HashMap<>();
		int key;
		String answer = "U";
		for(int i=0; i<n; i++) {
			key = Integer.parseInt(st.nextToken());
			if(m.get(key) == null) m.put(key, true);
			else {
				answer = "D";
				break;
			}
		}
		
		System.out.println(answer);
		br.close();
		
		return ;	
	}
}
