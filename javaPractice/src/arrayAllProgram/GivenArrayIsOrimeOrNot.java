package arrayAllProgram;

import java.util.Scanner;

public class GivenArrayIsOrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println("enter the value");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int count=0;
			int num=a[i];
			for(int j=1;j<a.length;j++) {
				if(num%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(num);
			}
		}
		System.out.println();
		
		
	}

}
