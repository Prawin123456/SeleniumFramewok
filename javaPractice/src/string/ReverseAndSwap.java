package string;

import java.util.Scanner;

public class ReverseAndSwap {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String s=sc.nextLine();
		String[]s1=s.split(" ");
		
		String temp=s1[0];
		s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
		String res=" ";
		
		for(int i=0;i<s1.length;i++) {
			res=res+s1[i]+" ";
			
		}
		System.out.println(res);
	}

}
