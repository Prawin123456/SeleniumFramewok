package practicAllProgram;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {

		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the length");
//		int n1=sc.nextInt();
//		int []a=new int[n1];
//		
//		int n2=sc.nextInt();
//		int []b=new int[n2];
//		
//		int n3=n1+n2;
//		int []c=new int[n3];
//		
//		int temp=0,temp1=0;
//		System.out.println("1st");
//		for(int i=0;i<n1;i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println("2nd");
//		for(int i=0;i<n2;i++) {
//			b[i]=sc.nextInt();
//		}
//		System.out.println("final");
//		for(int i=0;i<n3;i++) {
//			if(temp<n1) {
//				c[i]=a[temp];
//				temp++;
//			}
//			else {
//				c[i]=b[temp1];
//			}
//			
//		}
//		System.out.println("print array element");
//		for(int i=0;i<n3;i++) {
//			System.out.println(c[i]);
//		}
//	}

		Scanner sc=new Scanner(System.in);
		System.out.println("enter length 1st element");
		int n1=sc.nextInt();
		int []a=new int[n1];
		
		System.out.println("enter length 2nd element");
		int n2=sc.nextInt();
		int []b=new int[n2];
		
		int n3=n1+n2;
		int []c=new int[n3];
		
		int temp=0,temp1=0;
		System.out.println("element of 1st");
		for(int i=0;i<n1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("element of 2nd");
		for(int i=0;i<n2;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println("final answer:");
		for(int i=0;i<n3;i++) {
			if(temp<n1) {
				c[i]=a[temp];
				temp++;
			}
			else {
				c[i]=b[temp1];
				temp1++;
			}
		}
		for(int i=0;i<n3;i++) {
		System.out.println(c[i]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       }
	}
}
