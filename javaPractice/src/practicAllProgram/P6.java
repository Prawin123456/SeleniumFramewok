package practicAllProgram;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(sum<a[i]+a[j]) {
					sum=a[i]+a[j];
				}
			}
		}
		System.out.println(sum);
		
	}

}
