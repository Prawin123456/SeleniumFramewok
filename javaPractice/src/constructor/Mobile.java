package constructor;

public class Mobile {
	String name;
	String colour;
	int price;
	int size;

 Mobile(String name,String colour,int price,int size) {
	this.name=name;
	this.colour=colour;
	this.price=price;
	this.size=size;
	
}
	public void details() {
		System.out.println("name: "+name);
		System.out.println("colour: "+colour);
		System.out.println("price: "+price);
		System.out.println("size: "+size);
	}

}
 
