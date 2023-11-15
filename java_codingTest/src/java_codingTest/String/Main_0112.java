package java_codingTest.String;
import java.io.*;

public class Main_0112 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String answer = "";
		
		for(int i=0; i<n; i++) {
			//String s = str.substring(i*7, 7*(i)+7);
			//s = s.replace("#", "1");
			//s = s.replace("\\*", "0");		// 쌍따옴표로 해서 백슬래쉬 필요해보임
			
			String s = str.substring(0, 7).replace('#', '1').replace('*', '0');			
			answer += (char) Integer.parseInt(s, 2);
			
			str = str.substring(7);
		}
		
		System.out.println(answer);
		br.close();
		
		return ;
		
	}
}
