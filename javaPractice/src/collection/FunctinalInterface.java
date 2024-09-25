package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FunctinalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> a1=new ArrayList();
		a1.add(1);
		a1.add(10);
		a1.add(20);
		a1.add(15);
		a1.add(121);
		a1.add(98);
		a1.add(130);
		
		//for each loop
		System.out.println(a1);
	/*	for (Integer integer : a1) {
			System.out.println(integer);
		}*/
		Iterator  i=a1.iterator();
		System.out.println(i);
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(i.next());//NoSuchElementException
	}

}
