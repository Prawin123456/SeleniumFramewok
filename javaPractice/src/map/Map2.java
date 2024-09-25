package map;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class Map2 {

	public static void main(String[] args) {

		
		Hashtable ht=new Hashtable();
		ht.put("miller", "king");//{miller=king}
		ht.put("ram", "sita");//{ram=sita}
		ht.put("bheem", "chutki");
		ht.put("tom", "jery");
		//searching
		System.out.println(ht.containsKey("tom"));
		System.out.println(ht.containsKey("sita"));
		System.out.println(ht.containsKey("ram"));
		System.out.println(ht.containsValue("jery"));
		System.out.println(ht.get("tom"));
		System.out.println(ht.get("bheem"));
		System.out.println(ht.remove("ram"));
		System.out.println(ht.get("ram"));
		Set s=ht.entrySet();
		for(Object o:s) {
			System.out.println(o);
		}
		Set s1=ht.keySet();
		System.out.println(s1);
	
	Collection c=ht.values();
	System.out.println(c);
	}
	

}
