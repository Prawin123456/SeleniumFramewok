package practicAllProgram;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int n=sc.nextInt();
		int []a=new int[n];
		 System.out.println("the anser is");
		 for(int i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		 }
		 for(int i=0;i<n;i++) {
			 System.out.println(a[i]);
		 }
	}

}
