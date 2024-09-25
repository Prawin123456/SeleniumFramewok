package practicAllProgram;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array");
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				System.out.println(a[i]+"");
			}
		}
	}

}
