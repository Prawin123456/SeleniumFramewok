package constructorOverloading;

public class B {
	int a=20;
	
	public void display() {
		System.out.println(a);
		System.out.println(this.a);
	//	System.out.println(super.);

		
	}
      public static void main(String[] args) {
		B ref=new B();
		ref.display();
	}
}
