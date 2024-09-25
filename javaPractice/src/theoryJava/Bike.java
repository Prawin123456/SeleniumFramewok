package theoryJava;

public class Bike extends Vehicle {
	void run() {
		System.out.println("bike is ready");
	}

	public static void main(String[] args) {

		
		Bike b=new Bike();
		b.run();
	}

}
