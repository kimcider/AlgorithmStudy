package Q1_4_회문_순열;
import java.util.*;
public class Main {
	public static void main(String[]args) {
		compare("tattcta");
		compare("Tact Coa");
	}
	
	static void compare(String a) {
		System.out.println(check(a) + " " + checkWithBitVector(a));
	}
	
	static boolean check(String a) {
		a = a.toLowerCase();
		char[] ary = a.toCharArray();
		int[] counter = new int[26];
		for(int i = 0; i < a.length(); i++) {
			if(ary[i] == ' ') continue;
			counter[ary[i] - 'a']++;
		}
		int oddCounter = 0;
		for(int i = 0; i < 26; i++) {
			if(counter[i] % 2 != 0) {
				oddCounter++;
				if(oddCounter > 1) return false;
			}
		}
		return true;
	}
	
	static boolean checkWithBitVector(String a) {
		a = a.toLowerCase();
		BitSet bitset = new BitSet();
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == ' ') continue;
			bitset.flip(a.charAt(i) - 'a');
		}
		int counter = 0;
		for(int i = 0; i < 26; i++) {
			if(bitset.get(i) == true) {
				counter++;
				if(counter > 1) return false;
			}
		}
		return true;
	}
}
