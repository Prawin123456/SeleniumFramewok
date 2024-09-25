package methodOverloading;

public class Adder {
	public static int add(int a,int b) {
	 	System.out.println(a+b);
		return a+b;
	}
	public int add(int a,int b,int c) {
		System.out.println(a+b+c);
		return a+b+c;
	}
	public static void main(String[]args) {
		
		Adder adder = new Adder();
		Adder.add(2,3);
		adder.add(2, 3, 4);
	}
}
  

