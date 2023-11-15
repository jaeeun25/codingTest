package java_codingTest.Array;
import java.io.*;

public class Main_0203 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] arr_a = br.readLine().split(" ");
		String[] arr_b = br.readLine().split(" ");
		String answer = "";
		int result;
		
		for(int i=0; i<n; i++) {
			result = arr_a[i].charAt(0) - arr_b[i].charAt(0);

			if(result == 0) 
				answer += "D\n";
			else if(result == -2 || result == 1 ) 
				answer += "A\n";
			else 
				answer += "B\n";
		}
		
		System.out.println(answer);
		br.close();
		
		return ;
	}
}
