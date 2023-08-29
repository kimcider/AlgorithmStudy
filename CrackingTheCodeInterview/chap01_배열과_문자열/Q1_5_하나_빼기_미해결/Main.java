package Q1_5_하나_빼기_미해결;
import java.lang.Math;
public class Main {
	public static void main(String[]args) {
		tester("aaa","aaa");
		tester("aabb","aabb");
		
		tester("aaa","a");
		tester("a","aaa");
		
		tester("aab","aabb");
		tester("aabb","aab");
		
		tester("abc","at");
		tester("atcg","atcc");
		tester("atcg","atgc");
		
		
		tester("pale", "ple");
		tester("pales", "pale");
		tester("pale", "bale");
		tester("pale", "bake");
	}
	static void tester(String A, String B) {
		System.out.println(A+" & "+B+" : "+check(A, B));
	}
	
	
	static boolean check(String A, String B) {
		if(A.length() == B.length()) {
			return oneDigitReplace(A, B);
		}else if(A.length() + 1 == B.length()) {
			return oneDigitDelete(A, B);
		}else if(A.length() == B.length() + 1) {
			return oneDigitDelete(B, A);
		}
		
		return false;
	}
	
	static boolean oneDigitReplace(String A, String B) {
		boolean check = true;
		for(int i = 0; i < A.length(); i++) {
			if(A.charAt(i) != B.charAt(i)) {
				if(check == true) check = false;
				else return false;
			}
		}
		return true;
	}
	
	static boolean oneDigitDelete(String shortStr, String longStr) {
		boolean check = true;
		for(int shortIndex = shortStr.length() - 1; shortIndex >= 0; shortIndex--) {
			int longIndex = check == true ? shortIndex + 1 : shortIndex;
			if(shortStr.charAt(shortIndex) != longStr.charAt(longIndex)) {
				if(check == true) {
					check = false;
					shortIndex++;
				}else return false;
			}
		}
		return true;
	}
}


