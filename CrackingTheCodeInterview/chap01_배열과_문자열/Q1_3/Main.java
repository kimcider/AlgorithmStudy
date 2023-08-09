package Q1_3;

public class Main {
	public static void main(String[]args) {
		System.out.println(compare("Hello World"));
		System.out.println(compare("H e l l o  W o r l d"));
		System.out.println(compare("     "));
		System.out.println(replace("Mr John Smith"));
	}
	
	static boolean compare(String original) {
		String auto = original.replaceAll(" ", "%20");
		String my = replace(original);
		return auto.equals(my);
	}
	
	static String replace(String a) {
		int num = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == ' ') num++;
		}
		int len = a.length() + (2 * num);
		char[] ary = new char[len];
		
		int index = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) != ' ') ary[index++] = a.charAt(i);
			else {
				ary[index++] = '%';
				ary[index++] = '2';
				ary[index++] = '0';
			}
		}
		
		return new String(ary);
	}
}
