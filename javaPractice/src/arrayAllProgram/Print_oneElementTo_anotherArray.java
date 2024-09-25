package arrayAllProgram;

import java.util.Scanner;

public class Print_oneElementTo_anotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int size=sc.nextInt();
		int []a=new int[size];
		int[]b=new int[size];
		System.out.println("enter the value a[i]");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		b[i]=a[i];}
		System.out.println("print the answer b[i]");
		for(int i=0;i<a.length;i++) {
		
		System.out.println(b[i]);
		}
	}

}
