package java_codingTest.HashMap_TreeSet;
import java.io.*;
import java.util.*;

public class Main_0404 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s1 = br.readLine();
		String s2 = br.readLine();
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		int answer=0, lt=0;
		
		for(char c : s2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0)+1);
		}
		
		for(int i=0; i<s2.length()-1; i++) {
			map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
		}
		
		for(int rt=s2.length()-1; rt<s1.length(); rt++) {
			map1.put(s1.charAt(rt), map1.getOrDefault(s1.charAt(rt), 0)+1);
			if(map1.equals(map2)) answer++;
			
			map1.put(s1.charAt(lt), map1.get(s1.charAt(lt))-1);
			if(map1.get(s1.charAt(lt)) == 0) map1.remove(s1.charAt(lt));
			lt++;
		}
		
		System.out.println(answer);
		br.close();
		
		return ;
	}
}
