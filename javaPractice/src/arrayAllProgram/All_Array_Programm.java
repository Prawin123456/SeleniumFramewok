package arrayAllProgram;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class All_Array_Programm {

	public static void main(String[] args) {

		
	/*	Scanner sc=new Scanner(System.in);//TAKE INPUT FROM USER AND PRINT THAT VALUE
		System.out.println("Enter the Length");
		int n=sc.nextInt();
		int []a=new int[n];       //ARRAY DECLARATION
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextShort();
		
		System.out.println(a[i]);
	}
		
		
		
		Scanner sc=new Scanner(System.in);//Acsending order print the value
		System.out.println("Enter the Length");
		int n=sc.nextInt();
		int []a=new int[n];//Array declaration
		System.out.println("enter the value");
		 for(int i=0;i<a.length-1;i++) {
			 for(int j=0;j<a.length-1;j++) {
				 if(a[j]<a[j+1]) {
					 int temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				 }
			 }
		 }
		 System.out.println("Ascending order value");
		 for(int num:a) {
			 System.out.println(num + "");
		 }
	}
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length-1;i++) {
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<a[i+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			} 
		}
		System.out.println("Descending");
		for(int i=0;i<a.length;i++) {
		for(int num:a) {
			System.out.println(num + "");
		 }
	 }
		
		  int[] numbers = {5, 3, 8, 1, 2, 7, 6, 4};

	        // Print the original array
	        System.out.println("Original array: " + Arrays.toString(numbers));

	        // Sort the array in ascending order
	        Arrays.sort(numbers);

	        // Print the sorted array
	        System.out.println("Sorted array: " + Arrays.toString(numbers));
		Integer[] numbers = {5, 3, 8, 1, 2, 7, 6, 4};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
		
		
		
		Integer []n= {5,4,6,1,3,2,9,7,8};
		Arrays.sort(n, Collections.reverseOrder());
		
		System.out.println("ans: " +Arrays.toString(n));
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the length");
		int s=sc.nextInt();
		
		int[]a=new int[s];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
	//		System.out.println(a[i]);
		}
		int[]b=new int[s];
		int temp=0;
		for(int i=s-1;i>=0;i--) {
			b[temp]=a[i];
			temp++;
			
			
		}
		System.out.println("after reverse");
		for(int i=0;i<s;i++) {
			System.out.println(b[i]);
		}
		
		//Take input frth ofom user aaaaaaaaaand print that value
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int s=sc.nextInt();
		
		int[]a=new int[s];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		//	System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"");
		}
		
		
		//even index 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the length");
		 int s=sc.nextInt();
		 
		 int[]a=new int[s];
		 
		 for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		 }
		 for(int i=0;i<a.length;i++) {
				if(i%2!=0) {
					System.out.println(a[i]+"");
				}
					
				}
		
		
		
		//odd index
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int s=sc.nextInt();
		
		int[]a=new int[s];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
		
		//This print those value which is on even index,index starts from 0,1,2,3...
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int s=sc.nextInt();
		
		int[]a=new int[s];
		
		for(int i=0;i<a.length;i++) {
			
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println(a[i]+"");
			}
		}
		
		
		//odd index value
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int s=sc.nextInt();
		
		int[]a=new int[s];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("print the array elements");
		Boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {
			flag=true;
				System.out.println(a[i]+"");
			}
		}
		if(flag==false) {
			System.out.println("there is no odd");
		}
		
		
		
		//Average of an Elements,1+2+3=6
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length");
		int s=sc.nextInt();
		
		int[]a=new int[s];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
			System.out.println(sum);//input=1,2,3 output=1+0=1,1+2=3,3+3=6
			}
		double avg=sum/a.length;
		System.out.println(avg);
		
			//Highest sum in array
		
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int s=sc.nextInt();
		
		int[]a=new int[s];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			
		/for(int j=i+1;j<a.length;j++) {
			if(sum<a[i]+a[j])
			{
			 sum=a[i]+a[j];
	    }
      }
	}
		System.out.println(sum);
		
		
		//Copy element of one array to anothr array
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of first array");
		int s=sc.nextInt();
		
		int[]a=new int[s];
	
		int []b=new int[s];
		
		System.err.println("enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		 
		
		//MERGE TWO ARRAY ELEMENTS
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int s1=sc.nextInt();
		int []n=new int[s1];
		System.out.println("enter the length of 2nd array");
		int s2=sc.nextInt();
		int []m=new int[s2];
		
		int s3=s1+s2;
		int []d=new int[s3];

		int temp=0, temp1=0;
		System.out.println("enter the 1st elements");
		for(int i=0;i<s1;i++) {
			n[i]=sc.nextInt();
		}
		
		System.out.println("enter the 2nd element");
		for(int i=0;i<s2;i++) {
			m[i]=sc.nextInt();
		}
		for(int i=0;i<s3;i++) { 
			if(temp<s1) {
				d[i]=n[temp];
				temp++;
				}
			else {	
				d[i]=m[temp1];
				temp1++;
			}
		}
		System.out.println("the answere is:");
		for(int i=0;i<s3;i++) {
			System.out.println(d[i]);
		}
		
		
		//REVERSE AN ARRAY
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE LENGTH OF AN ARRAY");
		int size=sc.nextInt();
		int[]a=new int[size];
		int []b=new int[size];
		System.out.println("enter the element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=size-1;i>=0;i--) {
			b[temp]=a[i];
			temp++;
		}
		System.out.println("answere is:");
		for(int i=0;i<size;i++) {
			System.out.println(b[i]);
		}
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE LENGTH OF ARRAY");
		int size=sc.nextInt();
		int []a=new int[size];
		System.out.println("Enter the value");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<size;i++) {
			int temp=0;
			for(int j=0;j<size-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
		System.out.println("THE ANSWER IS:");
		
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
		
		//BUBBLE SORT DESCENDING ORDER
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE LENGTH OF AN ARRAY");
		int size=sc.nextInt();
		int []a=new int[size];
		System.out.println("ENTER THE VALUE");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			int temp=0;
			for(int j=0;j<size-1;j++) {
				if(a[j]<a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("THE ANSWER IS:");
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
		
		
		
		//MAXIMUM DIGIT IN ARRAY
		Scanner sc=new Scanner(System.in); 
		System.out.println("ENTER THE LENGTH OF AN ARRAY");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println("ENTER THE VALUE");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<size;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}
		}
		System.out.println("THE ANSWER IS:");
		System.out.println(max);*/
		
		//Remove dublicate
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the length");
//		int n=sc.nextInt();
//		int []a=new int[n];
//		System.out.println("enter the value");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println("Removal array");
//		for(int i=0;i<n;i++) {
//			int count=0;
//			for(int j=i;j<n;j++) {
//				if(a[i]==a[j]) {
//					count++;
//				}
//			}
//			
//				System.out.println(a[i]);
//			}
//		}
//		
		
		//TAKE INPUT FROM USER AND PRINT
		//-----------------------------------
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the length of array");
//		int n=sc.nextInt();
//		int []a=new int[n];
//		int []b=new int[n];
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println("the answer is:");
//		for(int i=0;i<n;i++) {
//			b[i]=a[i];
//			System.out.println(b[i]);
//		}
		
		 
		//print even and odd index value
		//--------------------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the length of array");
//		int n=sc.nextInt();
//		int []a=new int[n];
//		System.out.println("enter the element");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println("the even index value");
//		for(int i=0;i<n;i++) {
//			if(i%2==0) {
//				System.out.println(a[i]);
//			}
//		}
//		
		
		//average of given array
		//------------------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the length of an array");
//		int n=sc.nextInt();
//		int []a=new int[n];
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		int sum=0;
//		System.out.println("average");
//		for(int i=0;i<n;i++) {
//			sum+=a[i];
//			double avg=sum/a.length;
//		}
//		
		
		
		//merge two array
		//-----------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the length");
//		int size1=sc.nextInt();
//		int []a=new int[size1];
//		
//		int size2=sc.nextInt();
//		int []b=new int[size2];
//		
//		int size3=size1+size2;
//		int []c=new int[size3];
//		
//		int temp=0,temp1=0;
//		for(int i=0;i<size1;i++) {
//			a[i]=sc.nextInt();
//		}
//		for(int i=0;i<size2;i++) {
//			b[i]=sc.nextInt();
//		}
//		
//		for(int i=0;i<size1;i++) {
//			if(temp<size1) {
//				c[i]=a[temp];
//				temp++;
//			}
//			else {
//				c[i]=b[temp1];
//				temp1++;
//				break;
//				
//			}
//		}
//		for(int i=0;i<size3;i++) {
//			System.out.println(c[i]);
//		}
		
		
		//reverse the given array
		//--------------------------
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the length");
//		int n=sc.nextInt();
//		int []a=new int[n];
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		int temp=0;
//		int []b=new int[n];
//		for(int i=n-1;i>=0;i--) {
//			b[temp]=a[i];
//			temp++;
//		}
//		for(int i=0;i<n;i++) {
//			System.out.println(b[i]);
//		}
		
		
		
		//Ascending order
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the length of array");
//		int n=sc.nextInt();
//		int []a=new int[n];
//		System.out.println("enter the element of anarray");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		for(int i=0;i<n;i++) {
//		int temp=0;
//		for(int j=0;j<n-1;j++) {
//			if(a[j]>a[j+1]) {
//				temp=a[j];
//				a[j]=a[j+1];
//				a[j+1]=temp;
//			}
//		}
//		}
//			for(int i=0;i<n;i++) {
//		System.out.println(a[i]);
//			}
//	}
//}

		//Insert an element based on index
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("eneter the length");
//		int n1=sc.nextInt();
//		int []a=new int[n1];
//		System.out.println("enter the element");
//	    for(int i=0;i<n1;i++) {
//	    	a[i]=sc.nextInt();
//	    }
//	    	 int n2=n1+1;
//	    	 int[]b=new int[n2];
//	    	 int ind=1;
//	    	 int ele=2;
//	    	 int temp=0;
//	    	 if(ind>=0&&ind<n1) {
//	    		 for(int i=0;i<n2;i++) {
//	    			 if(i==ind) {
//	    				 b[i]=ele;
//	    			 }
//	    			 else {
//	    				 b[i]=a[temp+1];
//	    			 }
//	    		 }
//	    		 for(int i=0;i<n2;i++) {
//                 System.out.println(b[i]);
//	    	 }
//	    	 }
//	    		 else {
//	    			System.out.println("given index is invalid"); 
//	    		 }
//	     
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

		
	

