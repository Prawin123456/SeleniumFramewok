package arrayAllProgram;

import java.util.Scanner;

public class PrintOddValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int size=sc.nextInt();
		int[]a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("print the value");
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {
				System.out.println(a[i]+" ");
			}
		}

	}

}
