package javaConceptCoding;

public class MethodOverloading {
	
	public  int add(int a,int b) {
		return a+b;
		
	}
	public int add(int a,int b,int c) {
		return a+b+c;
		
	}
	public double add(double a,double b) {
		return a+b;
		
	}
	public static void main(String[]args) {
		
		MethodOverloading mo=new MethodOverloading();
		System.out.println(mo.add(10, 20));
		System.out.println(mo.add(10, 20,30));
		System.out.println(mo.add(0.5, 0.20));
	}

}
