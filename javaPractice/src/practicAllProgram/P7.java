package practicAllProgram;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int n=sc.nextInt();
		int []a=new int[n];
		int []b=new int[n];
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("the answer is:");
		for(int i=0;i<n;i++) {
			b[i]=a[i];
			System.out.println(b[i]);
		}
	}

}
