package 잃어버린_괄호;

import java.io.*;
public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] str = br.readLine().split("-");
			
			int answer = 0;
			for(int i = 0; i < str.length; i++) {
				String[] temp = str[i].split("\\+");
				int num = 0;
				for(int j = 0; j < temp.length; j++) {
					num += Integer.valueOf(temp[j]);
				}
				
				if(i == 0) {
					answer += num;
				}else {
					answer -= num;
				}
			}
			System.out.println(answer);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
