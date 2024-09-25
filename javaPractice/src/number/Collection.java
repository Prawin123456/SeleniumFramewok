package number;

import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		System.out.println(al.isEmpty());
		System.out.println(al.add("java"));
		System.out.println(al.isEmpty());
		System.out.println(al.contains("manual"));
		System.out.println(al.remove("java"));
		System.out.println(al.size());
		
	}

}
