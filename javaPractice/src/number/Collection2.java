package number;

import java.util.ArrayList;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList al=new ArrayList();
       al.add(12);
       al.add("e");
       al.add(true);
       al.add("java");
       al.add(12.35);
       al.add(0);
       al.add(3,'c');
       al.add(null);
       ArrayList all=new ArrayList();
       all.add(1);
       all.add(45);
       all.addAll(1, al);
       System.out.println(all);
       
       
	}

}
