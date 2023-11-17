package java_codingTest.Sorting_Searching;
import java.io.*;
import java.util.*;

public class Main_0609 {

	// 풀이
	public static int count(int[] arr, int capacity) {		// m개에 디스크에 담을 수 있는지 카운트
		int cnt = 1, sum = 0;	// DVD 장 수, 담아내는 곡들의 합
		
		for(int x : arr) {
			if(sum+x > capacity) {
				cnt++;
				sum = x;
			}
			else sum += x;
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		// 풀이
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt();		// stream은 리덕션 함수 제공 -> 큰 데이터에서 의미있는 데이터 뽑는(평균 등) + .리덕션 함수() 리턴 값은 OptionalInt로 변환 필요(.getAs타입())
		int rt = Arrays.stream(arr).sum();
		
		while(lt <= rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid) <= m) {
				answer = mid;
				rt = mid-1;
			}
			else lt = mid+1;
		}
		
		System.out.println(answer);
		br.close();
		
		return ;	
	}
}
