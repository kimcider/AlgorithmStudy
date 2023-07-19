package 크게_만들기;
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] str = br.readLine().split(" ");
			int N = Integer.valueOf(str[0]);
			int K = Integer.valueOf(str[1]);
			
			StringBuilder number = new StringBuilder();
			number.append(br.readLine());
			StringBuilder answer = new StringBuilder();
			while(K > 0) {
				boolean remove = false;
				answer = answer.delete(0, answer.length());
				
				for(int i = 1; i < number.length(); i++) {
					if((number.charAt(i - 1) - '0') < (number.charAt(i) - '0')) {
						K = K - 1;
						answer = answer.append(number.substring(i));
						remove = true;
						break;
					}else {
						answer = answer.append(String.valueOf(number.charAt(i - 1)));
					}
				}
				if(remove == false) {
					answer = answer.delete(answer.length() - (K - 1), answer.length());
					break;
				}
				number = number.delete(0, number.length());
				number = number.append(answer);
			}
			System.out.println(answer);
		}catch(IOException e) {
			
		}
	}

}
