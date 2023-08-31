package Q1_6_문자열_압축;
import java.util.*;
public class Main {
	public static void main(String[]args) {
		change("aabccccaaa");
		change("AAaAAAAaaa");
		change("abcde");
	}

	static void change(String original) {
		char prev = original.charAt(0);
		int prevCount = 1;
		String compressed = "";
		
		int index = 1;
		int originalLength = original.length();
		
		while(index < originalLength) {
			if(original.charAt(index)==prev) {
				prevCount++;
			}else {
				compressed = compressed.concat(String.valueOf(prev));
				compressed = compressed.concat(String.valueOf(prevCount));
				prev = original.charAt(index);
				prevCount = 1;
				
				if(compressed.length() > originalLength) {
					System.out.println(original);
					return;
				}
			}
			
			index++;
		}
		compressed = compressed.concat(String.valueOf(prev));
		compressed = compressed.concat(String.valueOf(prevCount));
		
		if(compressed.length() > originalLength) {
			System.out.println(original);
		}else {
			System.out.println(compressed);
		}
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
