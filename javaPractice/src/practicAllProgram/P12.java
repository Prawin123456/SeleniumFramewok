package practicAllProgram;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {

		//Descending Order
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]<a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
		System.out.println(a[i]);
	}
	}

}
