package excetionHandling;

public class ArrayOndexOutOfBoundsException {

	public static void main(String[] args) {

		try {
			int a[]=new int[5];
			a[3]=50;
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}

}
