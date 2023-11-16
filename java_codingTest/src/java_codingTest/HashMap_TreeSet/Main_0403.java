package java_codingTest.HashMap_TreeSet;
import java.io.*;
import java.util.*;

public class Main_0403 {
	
	// 풀이(해시 + 슬라이딩 윈도우)
	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0; i<k-1; i++) {	// rt 돌기 전까지 더해 놓기
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}

		int lt = 0;
		for(int rt=k-1; rt<n; rt++) {
			hm.put(arr[rt], hm.getOrDefault(arr[rt], 0)+1);
			answer.add(hm.size());
			
			// 윈도우 밀기
			hm.put(arr[lt], hm.get(arr[lt])-1);
			if(hm.get(arr[lt]) == 0) hm.remove(arr[lt]);
			lt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Map<String, Integer> map = new HashMap<>();
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		String[] str = br.readLine().split(" ");
		
		for(int i=0; i<k; i++) map.put(str[i], map.getOrDefault(str[i], 0)+1);
		sb.append(map.size() + " ");
		
		for(int i=0; i<n-k; i++) {
			if(map.get(str[i]) > 1) map.put(str[i], map.get(str[i])-1);
			else map.remove(str[i]);
			map.put(str[k+i], map.getOrDefault(str[k+i], 0)+1);
			
			sb.append(map.size() + " ");
		}
		
		System.out.println(sb);
		br.close();
		
		return ;
	}
}
