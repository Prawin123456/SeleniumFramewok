package stringall;

public class String4 {
	
	static String s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(s);
		String s1=new String();
		System.out.println(s1);
		
		String s2=new String("java");
		System.out.println(s2);
		
		char ch[]= {'a','b','c'};
		String s3=new String(ch);
		System.out.println(s3);
		
		byte[]b= {'7','8','5'};
		String s4=new String(b);
		System.out.println(s4);
		
	}

}
