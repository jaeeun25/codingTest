package java_codingTest.Sorting_Searching;
import java.io.*;
import java.util.*;

public class Main_0608 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		List<Integer> arr = new ArrayList<>();
		for(int i=0; i<n; i++) arr.add(Integer.parseInt(st.nextToken()));
		
		
		// 문제
		Collections.sort(arr);
		int lt=0, rt=n-1, mid = 0;
		
		// while -> 참일 때 반복
		while(lt <= rt) {			// 계속 탐색해 나가면 결국 lt가 커짐
			mid = (lt+rt)/2;
			if(arr.get(mid) > m) rt = mid-1;
			else if(arr.get(mid) < m) lt = mid+1;
			else break;
		}
		
		System.out.println(mid+1);
		br.close();
		
		return ;	
	}
}
