package collection;

import java.util.ArrayList;

public class ListIterator {

	private char[] previous;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList al=new ArrayList();
		al.add("java");
		al.add('c');
		al.add(1);
		al.add(1.2);
		al.add(true);
		al.add("hii");
		
		int pos=al.size();
		
		ListIterator li=(ListIterator) al.listIterator(pos);
		
		while(((java.util.ListIterator) li).hasPrevious()) {
			System.out.println(li.previous);
		}
	}
	
	}


