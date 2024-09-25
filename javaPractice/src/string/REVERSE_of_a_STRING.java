package string;

import java.util.Scanner;

public class REVERSE_of_a_STRING {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String x=sc.nextLine();
		String res=" ";
		for(int i=x.length()-1;i>=0;i--) {
			char ch=x.charAt(i);
			res=res+ch;
		}
	
		System.out.println("result"+"="+res);
	}

}
