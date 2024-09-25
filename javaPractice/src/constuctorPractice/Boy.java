package constuctorPractice;

//parameterised constructor

public class Boy {
	int id;
	String name;
	
	Boy(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy b1=new Boy(1,"a");
		Boy b2=new Boy(2,"b");
		b1.display();
		b2.display();
	}

}
