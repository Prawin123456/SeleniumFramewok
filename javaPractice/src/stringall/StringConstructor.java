package stringall;

public class StringConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="hello";
		String s2=new String("hello");
		System.out.println(s1);//toString overriden
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.hashCode());//overridden
		System.out.println(s2.hashCode());//overridden
		System.out.println();
	}

}
