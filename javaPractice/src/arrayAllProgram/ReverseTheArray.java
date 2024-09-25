package arrayAllProgram;

import java.util.Scanner;

public class ReverseTheArray {

	public static void main(String[] args) {

		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int size=sc.nextInt();
		int[]a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		int[]b=new int[size];
		int temp=0;
		for(int i=size-1;i>=0;i--) {
			b[temp]=a[i];
			temp++;
		}
		System.out.println("after reverse");
		for(int i=0;i<size;i++) {
			System.out.println(b[i]);
		}
		
		
		//Take input from user and print
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("Enter the value of an array");
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("the answer is:");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+"");
		}
		
		
		//Print Even Index And Odd Index
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int n=sc.nextInt();
		int[]a=new int[n];
		System.out.println("Enter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The answer is:");
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				System.out.println(a[i]+"");
			}
		}
		
		
		//Find Average
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int[]a=new int [n];
		System.out.println("ENter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			 sum+=a[i];
		     System.out.println(sum);
		}
		System.out.println("the answer is:");
			double avg=sum/a.length;
		System.out.println(avg);
		
		
		//Find Highest sum
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int[]a=new int [n];
		System.out.println("ENter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0,temp=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(sum<a[i]+a[j])
				{
					sum=a[i]+a[j];
				}
			}
		}
				System.out.println(sum);			}
			
		
		 
		//Copy one array to another array
	
	Scanner sc=new Scanner(System.in);
    

 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of an array");
	int n=sc.nextInt();
	int[]a=new int[n];
	System.out.println("Enter the value");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	//	System.out.println(a[i]);
	}
	System.out.println("The Answer is:");
	for(int i=0;i<n;i++) {
		System.out.println(a[i]+"");
	}
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the length");
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum +=a[i];
			System.out.println(sum);
		}
		double avg=sum/n;
	

        System.out.println(avg);
		
		
		
		
		//HIGHEST SUM
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("Enter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;0<n;i++) {
			for(int j=i+1;j<n;j++) {
			if(sum<a[i]+a[j]) {
				sum=a[i]+a[j];
			}
		  }
	     }
		System.out.println(sum);
	   }
     }
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int s=sc.nextInt();
		
		int[]a=new int[s];
		int sum=0;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			
		for(int j=i+1;j<a.length;j++) {
			if(sum<a[i]+a[j])
			{
			 sum=a[i]+a[j];
	    }
      }
	}
		System.out.println(sum);
		
		
		
		//merge one to another
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the lenghth of array");
		int size1=sc.nextInt();
		int []a=new int[size1];
		int size2=sc.nextInt();
		int[]b=new int[size2];
		int size3=size1+size2;
		int []c=new int[size3];  
		
		for(int i=0;i<size1;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size2;i++) {
			b[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<size3;i++) {
			if(temp<size1) {
				
				
			}
			
		}
		
		//PRIME OR NOT
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int[]a=new int[n];
		System.out.println("Enter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		System.out.println("The answer is");
		for(int i=0;i<n;i++) {
			int count=0;
			int num=a[i];
			for(int j=0;j<=num;j++) {
				if(num%j==0) {
					count++;
				}
			}
			if(count==2) {
			System.out.println(num);
		}
		}
			 
		System.out.println();
		
		//merge
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int s1=sc.nextInt();
	int[]a=new int[s1];
	System.out.println("1:");
	int s2=sc.nextInt();
	int[]b=new int[s2];
	System.out.println("2:");
	int s3=s1+s2;
	int[]c=new int[s3];
	
	int temp=0,temp1=0;
	System.out.println("first:");
	for(int i=0;i<s1;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("second:");
	for(int i=0;i<s2;i++) {
		b[i]=sc.nextInt();
	}
	for(int i=0;i<s3;i++) {
		if(temp<s1) {
			c[i]=a[temp];
			temp++;
		}
		else {
			c[i]=b[temp1];
			temp1++;
		}
	}
	System.out.println("print:");
	for(int i=0;i<s3;i++) {
		System.out.println(c[i]);
	}
		
		//reverse
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length:");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int[]b=new int[n];
		int temp=0;
		for(int i=n-1;i>=0;i--) {
			b[temp]=a[i];
			temp++;
		}
		System.out.println("answer:");
		for(int i=0;i<n;i++) {
			System.out.println(b[i]);
		}
		
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length:");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int temp=0;
		int []b=new int[n];
		for(int i=n-1;i>=0;i--) {
			b[temp]=a[i];
			temp++;
		}
		for(int i=0;i<n;i++) {
			System.out.println(b[i]);
		}
				
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the length");
		int n=sc.nextInt();
		int[]a=new int[n]; 
	//	int[]b=new int[n];
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		
		int temp=0;
		int[]b=new int[n];
		for(int i=n-1;i>=0;i--) {
			b[temp]=a[i];
			temp++;
			
		}
		System.out.println("answer");
		for(int i=0;i<n;i++) {
			System.out.println(b[i]);
		}
		
		
		//ASCENDING ORDER(BUBBLE SORT) and DESCENDING ORDER
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int n=sc.nextInt();
		int[]a=new int[n];
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("answer:");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
		//MAXIMUM VALUE IN ARRAY
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the length");
		int n=sc.nextInt();
		int[]a=new int[n];
		
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int n=sc.nextInt();
		int[]a=new int[n];
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		int min=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		int max=min,secmax=0;
		for(int i=0;i<n;i++) {
			if(a[i]>max) {
				
				secmax=max;
				max=a[i];
				}
			else if(a[i]>secmax&&max!=a[i]) {
				secmax=a[i];
			}
		}
		System.out.println(secmax);
		
		
		//Second Minimum
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]<max) {
				max=a[i];
			}
		}
		System.out.println("answer:");
		System.out.println(max);
		
		
		
		//Insert element based on index
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the length");
		int size1=sc.nextInt();
		int[]a=new int[size1];
		System.out.println("enter the value");
		for(int i=0;i<size1;i++) {
			a[i]=sc.nextInt();
		}
		int size2=size1+1;
		int[]b=new int[size2];
		int ind=1;
		int ele=2;
		int temp=0;
		if(ind>=0&&ind<size1) {
			for(int i=0;i<size2;i++) {
				if(i==ind) {
					b[i]=ele;
				}
				else {
					b[i]=a[temp++];
				}
			}
			System.out.println("After inserting element");
			for(int i=0;i<size2;i++) {
				System.out.println(b[i]);
			}
		}
		else {
			System.out.println("given index is invalid");
		}
		
		
		//PALINDROME OR NOT
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE LENGTH");
		int n=sc.nextInt();
		int []a=new int[n];
		int []b=new int[n];
		System.out.println("ENTER THE VALUE");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=n-1;i>=0;i--) {
			b[temp]=a[i];
			temp++;
			}
		boolean flag=false;
		for(int i=0;i<n;i++) {
			if(a[i]==b[i]) {
				flag=true;
				}
			else {
				flag=false;
				break;
			}
		}
			if(flag==true) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not palindrome");
			}
			
		}
		
		
		
		//INSERT AN ELEMENT BASED ON INDEX
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int size1=sc.nextInt();
		int []a=new int[size1];
		System.out.println("Enter the value");
		for(int i=0;i<size1;i++) {
			a[i]=sc.nextInt();
		}
		int size2=size1+1;
		int[]b=new int[size2];
		int ind=1;
		int ele=2;
		int temp=0;
		if(ind>=0 && ind<size1) {
			for(int i=0;i<size2;i++) {
				if(i==ind) {
					b[i]=ele;
				}
				else {
					b[i]=a[temp++];
				}
			}
			for(int i=0;i<size2;i++) {
				System.out.println(b[i]);
			}
			}
		else {
			System.out.println("given index invalid");
		}
		
		
		
		 //REMOVE THE ELEMENT BASED ON INDEX
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int size1=sc.nextInt();
		int []a=new int[size1];
		System.out.println("enter the value");
		for(int i=0;i<size1;i++) {
			a[i]=sc.nextInt();
		}
		
		int size2=size1-1;
		int []b=new int[size2];
		int ind=3;
		int temp=0;
		if(ind>=0 && ind<size1) {
			for(int i=0;i<size1;i++) {
				if(i!=ind) {
					b[temp++]=a[i];
				}
			}
			System.out.println("the answer is:");
			for(int i=0;i<size2;i++)
			{
				System.out.println(b[i]);
			}
		}
			else {
				System.out.println("invalid");
			}
		}
		
		
		
		//PRINT THE DISTINCT VALUE
		//-------------------------
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("enter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("distinct value");
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(a[i]);
			}
		}*/
		
		
		//DUPLICATE VALUE PRINT
		
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("enter the value");
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
        	int count=0;
        	for(int j=i+1;j<n;j++) {    //j=i for removal
        		if(a[i]==a[j]) {
        			count++;
        		}
        	}
        	if(count==1) {
        		System.out.println(a[i]);
        	}
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
	
		
	


		
		
		
		
		


	


