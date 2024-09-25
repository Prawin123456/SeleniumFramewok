package stringall;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="good";
		String s2="good";
		String s3=s1.toUpperCase();
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
	}

}
