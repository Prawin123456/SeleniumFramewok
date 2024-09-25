package map;

import java.util.Hashtable;

public class Map1 {

	public static void main(String[] args) {

		
		Hashtable<Integer, String> ht=new Hashtable();
		ht.put(1, "om");
		ht.put(2, "pk");
	//	ht.put("miller", 3);//compile time exception
	//	ht.put(76, null);//null point exception
	//	ht.put(null, "king");//null point exception
		ht.put(4, "king");
		ht.put(5, "adam");
		ht.put(6, "queen");
		ht.put(7, "raj");
		System.out.println(ht);
	}

}
