package constructor;

public class Bike {
	
	String name;
	String colour;
	int cc;
	int mileage;

Bike(String name,String colour,int cc,int mileage){
	this.name=name;
	this.colour=colour;
	this.cc=cc;
	this.mileage=mileage;

}
public void details() {
	System.out.println("name of bike"+name);
	System.out.println("colour of bike"+colour);
	System.out.println("cc of bike"+cc);
	System.out.println("mileage of bike"+mileage);
}

}
