package number;

public abstract class AbstractMethod1 {

	
		abstract void display(); //abstract method
	    void show(){              //not an abstract (normal way of declaration) method
	    System.out.println("Show method is called");
	                }
}

	class B extends  AbstractMethod1{
	    void display(){
	    System.out.println("CLASS A");
	      }
	
	
	public static void main(String args[]){
	B obj=new B();
	obj.display();
	obj.show();
	}

	}

	
	


