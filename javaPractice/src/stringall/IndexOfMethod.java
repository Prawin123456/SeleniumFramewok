package stringall;

public class IndexOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello world program";
		int index=s.indexOf("l");
		System.out.println(index);
		
		int index1=s.indexOf("ll");
		System.out.println(index1);
		
		int index2=s.indexOf("world");
		System.out.println(index2);
		
		int index3=s.indexOf("l", index2+1);
		System.out.println(index3);
		 
		
		int i=s.indexOf(index1, index2, index3);
		System.out.println(i);

	}

}
