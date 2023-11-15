package java_codingTest.Array;
import java.io.*;
import java.util.*;

public class Main_0206 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		boolean[] prime = new boolean[100001];
		String[] arr = br.readLine().split(" ");
		String answer = "";
		
		prime[0] = prime[1] = true;
		for(int i=2; i<=100000; i++) {
			if(prime[i]) continue;
			for(int j=i*2; j<100000; j+=i) {
				prime[j] = true;
			}
		}
		
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(new StringBuilder(arr[i]).reverse().toString());
			
			if(!prime[num]) answer += num + " ";
		}	
		
		System.out.println(answer);
		
		
		br.close();
		
		return ;
		
	}
	
	
	// 풀이
	public boolean isPrime(int num) {
		if(num == 1) return false;
		
		for(int i=2; i<num; i++) {
			if(num%i==0) return false;
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int tmp = arr[i];
			int res = 0;			// 숫자 역순 저장됨
			
			while(tmp > 0) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp /= 10;
			}
			
			if(isPrime(res)) answer.add(res);
		}
		
		return answer;
	}
}
