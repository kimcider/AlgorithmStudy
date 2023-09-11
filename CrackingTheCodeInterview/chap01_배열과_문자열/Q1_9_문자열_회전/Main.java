package Q1_9_문자열_회전;

public class Main {
	public static void main(String[]args) {
		String a = "waterbottle"; 
		String b = "erbottlewat";
		
		System.out.println(checker(a, b));
		
	}
	
	//O(n^2)
	static boolean checker(String s1, String s2) {
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
}
