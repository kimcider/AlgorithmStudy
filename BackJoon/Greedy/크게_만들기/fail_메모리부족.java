package 크게_만들기;
import java.io.*;
import java.util.*;
public class fail_메모리부족 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] str = br.readLine().split(" ");
			int N = Integer.valueOf(str[0]);
			int K = Integer.valueOf(str[1]);
			LinkedList<Character> list = new LinkedList<>();
			
			String number = br.readLine();
			for(int i = 0; i < N; i++) {
				list.add(number.charAt(i));
			}
			
			LinkedList<Character> answer = new LinkedList<>();
			
			while(K > 0) {
				boolean remove = false;
				answer = new LinkedList<>();
				for(int i = 1; i < list.size(); i++) {
					if(list.get(i - 1) < list.get(i)) {
						K = K - 1;
						answer.addAll(answer.size(), list.subList(i, list.size()));
						remove = true;
						break;
					}else {
						answer.add(list.get(i - 1));
					}
				}
				if(remove == false) {
					
					for(int i = 0; i < K - 1 ;i++) {
						answer.removeLast();
					}
					break;
				}
				list = answer;
			}
			for(int i = 0; i < answer.size(); i++) {
				System.out.print(answer.get(i));
			}

		}catch(IOException e) {
			
		}
	}

}
