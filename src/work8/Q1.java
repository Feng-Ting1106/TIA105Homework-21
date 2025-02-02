package work8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Q1 {
	public static void main(String[] args) {
		List collection = new ArrayList();
		collection.add(new Integer (100));
		collection.add(new Double(3.14));
		collection.add(new Long(21L));
		collection.add(new Short("100"));
		collection.add(new Double(5.1));
		collection.add("Kitty");
		collection.add(new Integer (100));
		collection.add(new Object());
		collection.add("Snoopy");
		collection.add(new BigInteger ("1000"));
		
		System.out.println("---iterator 迭代器---");
		Iterator iterator = collection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("---傳統for迴圈---");
		for(int i = 0; i< collection.size(); i++) {
			System.out.println(collection.get(i));
		}
		
		
		System.out.println("---for each---");
		for(Object i : collection) {
			System.out.println(i);
		}
		
		Iterator iterator1 = collection.iterator();

		System.out.println("---移除非Number相關物件後---");
		while(iterator1.hasNext()) {
			Object i = iterator1.next();
			if(!(i instanceof Number)) {
				iterator1.remove();
			}
		}
		
		for(Object i : collection) {
			System.out.println(i);
		}
		
	}
}
