package java_codingTest.Sorting_Searching;
import java.io.*;
import java.util.*;

class Point implements Comparable<Point>{
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) return this.y - o.y;	// 내림차순으로 할 시 o와 this 순서 변경
		else return this.x - o.x;
	}
}

public class Main_0607 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		List<Point> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr.add(new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		// 문제
		Collections.sort(arr);		// 일반 배열은 안됨
		
		for(Point p : arr) sb.append(p.x + " " + p.y + "\n");
		
		System.out.println(sb);
		br.close();
		
		return ;	
	}
}
