package Q1_2;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		System.out.println(check1("atGC", "atGG") + " " + check2("atGC", "atGG"));
		System.out.println(check1("atgG", "AtgG") + " " + check2("atgG", "AtgG"));
		System.out.println(check1("+-0x", "+-0x") + " " + check2("+-0x", "+-0x"));
		System.out.println(check1("aa", "a") + " " + check2("aa", "a"));
		System.out.println(check1("aa", "aa") + " " + check2("aa", "aa"));
	}
	
	static boolean check1(String a, String b) {
		if(a.length() != b.length()) return false;
		int hash[] = new int[128];
		int length = a.length();
		
		for(int i = 0; i < length; i++) {
			hash[a.charAt(i)]++;
			hash[b.charAt(i)]--;
		}
		
		for(int i = 0; i < 128; i++) {
			if(hash[i] != 0) return false;
		}
		return true;
	}
	
	static boolean check2(String a, String b) {
		if(a.length() != b.length()) return false;
		char[] aList = a.toCharArray();
		char[] bList = b.toCharArray();
		
		Arrays.sort(aList);
		Arrays.sort(bList);
		
		return new String(aList).equals(new String(bList));
	}
}
