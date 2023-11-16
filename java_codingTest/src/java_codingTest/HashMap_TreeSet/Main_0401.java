package java_codingTest.HashMap_TreeSet;
import java.io.*;
import java.util.*;

public class Main_0401 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		
		// 문제
		Map<Character, Integer> map = new HashMap<>();
		int max = Integer.MIN_VALUE;
		char answer = '\0';
		
		for(int i=0; i<n; i++) {
			char key = str.charAt(i);
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		
		for(char k : map.keySet()) {
			if(max < map.get(k)) {
				max = map.get(k);
				answer = k;
			}
		}
		
		System.out.println(answer);
		br.close();
		
		return ;
	}
}
