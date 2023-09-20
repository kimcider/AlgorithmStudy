package Hashtable;

import java.util.Hashtable;

public class AddElementsToHashtable {
	public static void main(String[]args) {
		Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        System.out.println(ht1);
 
        
        ht1.put(1, "일");
        System.out.println(ht1);
	}
}
