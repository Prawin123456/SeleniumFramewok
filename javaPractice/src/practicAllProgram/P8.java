package practicAllProgram;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int n=sc.nextInt();
		int []a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			
			int count=0;
			int num=a[i];
			
			for(int j=0;j<=num;j++) {
				if(num%j==1) {
					count++;
				}
				}
			if(count==2) {
				System.out.println(num);
			}
		}
		System.out.println();
		
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the length");
//		int n=sc.nextInt();
//		int []a=new int [n];
//		System.out.println("enter the element of array");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//			
//		}
//		for(int i=0;i<n;i++) {
//			if() {
//		}
//		
//		
//		
	}

}
