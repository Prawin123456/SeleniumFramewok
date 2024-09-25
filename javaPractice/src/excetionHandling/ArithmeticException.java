package excetionHandling;

public class ArithmeticException {

	public static void main(String[] args) {

		
	try {
		int a=50/0;
		
	} catch (Exception e) {
		
		System.out.println(e);
	}
	
	System.out.println("rest of the code");
	}

}
