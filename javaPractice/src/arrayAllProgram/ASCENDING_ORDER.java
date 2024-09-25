package arrayAllProgram;

import java.util.Scanner;

public class ASCENDING_ORDER {

	public static void main(String[] args) {
		
		/*int []a= {5,3,2,9,7,6,4};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		  }
		}
		System.out.println("array in ascending order");
		for(int num:a) {
			System.out.println(num + "");	
		}
      }

   }*/
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the value");
//		
//		int n=sc.nextInt();
//		
//		int []a=new int[n];
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//		
//		}
//			for(int j=0;j<a.length-1;j++) {
//				if(a[j]<a[j+1]) {
//				int	temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//					
//					
//				}
//			}
//			
//		
//		for(int num:a) {
//			System.out.println(num + "");
//			
//		}
//		
//		
//	}
//}
//		
//		
		
		
		//ASCENDING ORDER
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("enter the array elemnt");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		System.out.println("your answer is:");
		for(int i=0;i<n;i++) {
			int temp;
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

