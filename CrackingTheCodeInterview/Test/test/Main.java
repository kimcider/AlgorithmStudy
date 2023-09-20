package test;

import java.util.*;
public class Main {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = Integer.valueOf(scanner.nextLine());
		int b = Integer.valueOf(scanner.nextLine());
		
		if(a < b) {
			System.out.println("<");
		}else if(a > b) {
			System.out.println(">");
		}else {
			System.out.println("=");
		}
	}
}
