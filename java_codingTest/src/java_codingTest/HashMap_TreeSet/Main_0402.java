package java_codingTest.HashMap_TreeSet;
import java.io.*;
import java.util.*;

public class Main_0402 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		Map<Character, Integer> map = new HashMap<>();
		String answer = "YES";
		
		for(char c : str1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char key : str2.toCharArray()) {
			//if(!map.containsKey(key) || map.get(key) == 0)로도 작성 가능
			if(map.get(key) == null || map.get(key) == 0) {
				answer = "NO";
				break;
			}
			else
				map.put(key, map.get(key)-1);
		}
		
		System.out.println(answer);
		br.close();
		
		return ;
	}
}
