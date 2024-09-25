package theoryJava;

public class Method2 {
	
	public static void add() {
		System.out.println(1+2);
	}
	public static void sub() {
		System.out.println(2-1);
	}
	public static void mul(int a,int b) {
		System.out.println(a*b);
	}

	
	public static void main(String[] args) {

		System.out.println("hello");
		add();
		sub();
		mul(10, 20);
		mul('a',2);
		mul(2,'A');
		mul('0','1');
		add();
		
	}

}
