package LinkedList;

import java.util.LinkedList;

public class Main {
	static LinkedList<Integer> list = new LinkedList<>();
	public static void main(String[] args) {
		list.add(18);list.add(20);list.add(0);list.add(38);list.add(8);list.add(2);list.add(16);list.add(10);list.add(14);list.add(24);
		list.add(30);list.add(34);list.add(12);list.add(32);list.add(22);list.add(6);list.add(4);list.add(36);list.add(26);
		
		System.out.println(list.toString());
		
		Integer i = list.get(0);
		Integer j = list.get(1);
		
		swap(i, j);
		
		System.out.println(list.toString());
	}
	
	static void swap(Integer i, Integer j) {
		Integer temp = list.get(i);
	}
}
