package java_codingTest.Array;
import java.io.*;

public class Main_0201 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		String answer = str[0] + " ";
		
		for(int i=1; i<n; i++) {	
			if(Integer.parseInt(str[i-1]) < Integer.parseInt(str[i])) {
				answer += str[i] + " ";
			}
		}
		
		System.out.println(answer);
		br.close();
		
		return ;
		
	}
}
