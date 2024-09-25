package arrayAllProgram;

import java.util.Scanner;

public class SortInAscendingOrder {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int size=sc.nextInt();
		int[]a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("bubble sort value");
		int temp=0;
		for(int j=0;j<a.length;j++) {
			if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			  }
			}
		
				
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
	 }
   }
}

	
	


