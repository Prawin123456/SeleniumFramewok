package arrayAllProgram;

import java.util.Scanner;

public class MergeTwoArraryInZigZagManner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int size1=sc.nextInt();
		int[]m=new int[size1];

		int size2=sc.nextInt();
		int[]n=new int[size1];
		
		int size3=sc.nextInt();
		int[]d=new int[size1];
		
		int temp=0;int temp1=0;
		System.out.println("enter the array element");
		for(int i=0;i<size1;i++) {    
			n[i]=sc.nextInt();
		}
		for(int i=0;i<size2;i++) {
			d[i]=sc.nextInt();
		}
		for(int i=0;i<size3;i++) {
			if(temp<size1) {
				d[i]=n[temp];
				temp++;
			    i++;
			}
			if(temp1<size2) {
				d[i]=m[temp1];
				temp++;
			}
		}
		System.out.println("print the array");
			for(int i=0;i<size2;i++) {
				System.out.println(d[i]);
			}
			
		}
		
		
	}


