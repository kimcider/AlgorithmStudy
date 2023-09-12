package Q1_9_문자열_회전;

public class Main {
	public static void main(String[]args) {
		
		System.out.println(answer("waterbottle", "erbottlewat"));
		System.out.println(answer("AAA", "AA"));
		System.out.println(answer("AAAAAABBC", "AAABBCAAA"));
		System.out.println(answer("kimcider", "ciderkim"));
		System.out.println(answer("kim cider", "cider kim"));
		System.out.println(answer("kim cider", " ciderkim"));
	}
	
	//O(n^2)
	static boolean checker(String s1, String s2) {
		System.out.print(s1 + ", " + s2 + ": ");
		
		if(s1.length() != s2.length()) return false;
		
		for(int i = 0; i < s1.length(); i++) {
			for(int j = 0; j < s2.length(); j++) {
				if(s1.charAt(i) != s2.charAt(j)) continue;
				else {
					boolean checker = false;
					int s1dex = (i + 1) % s1.length();
					int s2dex = (j + 1) % s1.length();
					
					for(int k = 1; k < s1.length(); k++) {
						if(s1.charAt(s1dex) != s2.charAt(s2dex)) {        
							checker = true;
							break;
						}else {
							s1dex = (s1dex + 1) % s1.length();
							s2dex = (s2dex + 1) % s1.length();
						}
					}
					if(checker == false) return true;
				}
			}
		}
		
		return false;
	}
	
	static boolean answer(String s1, String s2) {
		System.out.println(s1 + ", " + s2 + ": ");
		String temp = s1 + s1;
		if(temp.contains(s2)) {
			int start_index = temp.indexOf(s2);
			String temps1 = temp.substring(0, start_index) + temp.substring(start_index + s2.length());
			if(temps1.equals(s1))return true;
			else return false;
		}
		return false;
	}
}
