package stringall;

public class Getchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="hello world programm";
		char ch[]=new char[10];
		
		try {
			s1.getChars(6, 16, ch, 0);
			System.out.println(ch);
			
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
	}

}
