package practicAllProgram;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {

		
		//find fibonacci series
		//------------------------
		
//		int n=10;
//		int a=0,b=1,c=0;
//		for(int i=1;i<=n;i++) {
//			System.out.print(a+" ");
//			c=a+b;
//			a=b;
//			b=c;
//		}
		
		//count digit
		//----------------
		
//		int count=0;
//		int n=123;
//		while(n>0) {
//			n=n/10;
//			count++;
//		}
//		System.out.println(count);
		
		//sum of digit
		//--------------
//		
//		int n=123;
//		int sum=0;
//		while(n>0) {
//			int d=n%10;
//			sum=sum+d;
//			n=n/10;
//		}
//		System.out.println(sum);
		
		//Swap two number
		//-----------------
		
		
//		int a=10;
//		int b=20;
//		int c=a;
//		a=b;
//		b=c;
//		System.out.println("a="+a+"b="+b);
//		
//		
		
		//Swap two variable without third variable
		//-----------------------------------------
		
//		int a=10;
//		int b=20;
//		a=b+a;
//		b=a-b;
//		a=a-b;
//		System.out.println(a+"="+b);
		
		//factor
		//--------------
		
		
//		int n=5;
//		int fact=0;
//		System.out.println("the factor is:");
//
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				System.out.println(i);
//			}
//		}
//		
		
		//Prime number
		//---------------
//		
//       int n=5;
//	     int count=0;
//			for(int j=0;j<=n;j++) {
//				if(n%j==0) {
//					count++;
//				}
//			}
//			if(count==2) {
//				System.out.println(n);
//			}
//		}
//		
		
		//maximum digit present in given number
		//--------------------------------------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the digit");
//		int n=sc.nextInt();
//		long max=n%10;
//		while(n>0) {
//			long d=n%10;
//			if(d>max) {
//				max=d;
//				
//			}
//			n=n/10;
//			
//		}
//		System.out.println(max);
//		
		//Minimum Digit
	//	--------------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the digit");
//		int n=sc.nextInt();
//		long min=n%10;
//		while(n>0) {
//			long d=n%10;
//			if(d<min) {
//				min=d;
//			}
//			n=n/10;
//		}
//		System.out.println(min);
//		
		//Reverse given number
		//-------------------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the digit");
//		int n=sc.nextInt();
//		int rev=0;
//		while(n>0) {
//			int d=n%10;
//			rev=(rev*10)+d;
//			n=n/10;
//		}
//		System.out.println(rev);
		
		
		//Palindrome
		//--------------
		
//		int n=121,rev=0,copy=0;
//		while(n>0) {
//			int d=n%10;
//			rev=(rev*10)+d;
//			n=n/10;
//		}
//		if(copy==rev) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}
//		
		
		//reverse the string
		//-----------------------
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String res="";
//		for(int i=x.length()-1;i>=0;i--) {
//			char ch=x.charAt(i);
//			res=res+ch;
//		}
//		System.out.println(res);
//		
		
		//palindrom
		//------------
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String res="";
//		for(int i=x.length()-1;i>=0;i--) {
//			char ch=x.charAt(i);
//			res=res+ch;
//			if(x.equals(res)) {
//				System.out.println("palindrom");
//			}
//			else {
//				System.out.println("not palindrom");
//			}
//		}
//		
//		
//		
		
		
		//Maximum word length
		//--------------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String s[]=x.split("");
//		String max=s[0];
//		for(int i=0;i<=s.length;i++) {
//			String word=s[i];
//			if(word.length()>max.length()) {
//				max=word;
//			}
//		
//			System.out.print(max);
//		}
		
		
//		 Scanner sc = new Scanner(System.in);
//	        System.out.println("Enter the string:");
//	        String x = sc.nextLine();
//	        
//	        // Split the string into words
//	        String[] s = x.split(" ");
//	        
//	        // Initialize the maximum length word as the first word
//	        String max = s[0];
//	        
//	        // Iterate through the array to find the word with the maximum length
//	        for (int i = 1; i < s.length; i++) {  // Start from 1 since max is initialized with s[0]
//	            String word = s[i];
//	            if (word.length() > max.length()) {
//	                max = word;
//	            }
//	        }
		
		//Reverse last word
		//---------------------
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String []s=x.split(" ");
//		String word=s[s.length-1];
//		String rev="";
//        for(int i=word.length()-1;i>=0;i--) {
//			char ch=word.charAt(i);
//			rev=rev+ch;
//		}
//		String res="";
//		s[s.length-1]=rev;
//		for(int i=0;i<s.length;i++) {
//			res=res+s[i]+" ";
//		}
//        
//		System.out.println(res);
//		
//		
		
		// 1.Reverse string
		//-------------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("entre the string");
//		String x=sc.nextLine();
//		String res="";
//		System.out.println("the answer is:");
//		for(int i=x.length()-1;i>=0;i--) {
//			char ch=x.charAt(i);
//			res=res+ch;
//		}
//		System.out.println(res);
//		
		
		//palindrome
		//------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String res="";
//		for(int i=x.length()-1;i>=0;i--) {
//			char ch=x.charAt(i);
//			res=res+ch;
//			if(x.equals(res)) {
//				System.out.println("palindrome");
//			}
//			else {
//				System.out.println("not palindrome");
//			}
//			}
//		
		//MAXIMUM WORD LENGTH
		//-----------------------
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String x=sc.nextLine();
		String s[]=x.split(" ");
		String max=s[0];
		System.out.println("the answer is:");
		for(int i=0;i<x.length();i++) {
			String word=s[i];
			if(word.length()>max.length()) {
				max=word;
			}
			System.out.println(max);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


