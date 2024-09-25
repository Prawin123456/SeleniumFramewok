package map1;

import java.util.Hashtable;

public class Hashtable11 {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(1, "smith");
		ht.put(2, "allen");
		ht.put(3, "null");
	//	ht.put(null, "smith");//NPE
	//	ht.put("miller", 4);
	//	ht.put(75, null);//NPE
		ht.put(6, "king");
		ht.put(76, "raju");
		ht.put(1, "suraj");
		ht.put(1, "raja");
		System.out.println(ht);//toString is overridden
		
	}

}
