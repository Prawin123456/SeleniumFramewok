package practicAllProgram;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=n-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}
