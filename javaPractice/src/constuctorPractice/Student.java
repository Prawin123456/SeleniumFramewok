package constuctorPractice;

//Default constructor

public class Student {
	int id;
	String name;

	void Student() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student s1 = new Student();//object creation
		Student s2 = new Student();
		
		s1.Student();//display value of object
		s2.Student();
	}

}
