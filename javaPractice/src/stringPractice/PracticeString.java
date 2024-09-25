package stringPractice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeString {

	public static void main(String[] args) {

		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the array length");
//		int n=sc.nextInt();
//		int []a=new int[n];
//		System.out.println("enter array element");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println("print value");
//		for(int i=0;i<n;i++) {
//			System.out.println(a[i]);
//		}
		
		
		
		//pritn even index
		//------------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the length of array");
//		int n=sc.nextInt();
//		int []a=new int[n];
//		System.out.println("enter the array element");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println("the even value :");
//		for(int i=0;i<n;i++) {
//			if(i%2==0) {
//				System.out.println(a[i]);
//			}
//		}
		
		
		
		
		//print odd index
		//------------------
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the array length");
//		int n=sc.nextInt();
//		int []a=new int[n];
//		System.out.println("enter array element");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		boolean flag=false;
//		for(int i=0;i<n;i++) {
//			if(i%2!=0) {
//				flag=true;
//				System.out.println(a[i]);
//				
//			}
//		}
//		if(flag==flag) {
//			System.out.println("there is no odd element");
//		}
//		
		
		//Find average of given element
		//-------------------------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the length of array");
//		int n=sc.nextInt();
//		int []a=new int [n];
//		System.out.println("enter the array element");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			sum+=a[i];
//			System.out.println(a[i]);
//		}
//			double avg=sum/n;
//			System.out.println(avg);
//		}
//		
		
		//copy one array to another array
		//------------------------------------
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the length of array");
//		int n=sc.nextInt();
//		int []a=new int[n];
//		int []b=new int[n];
//		System.out.println("a");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println("b");
//		for(int i=0;i<n;i++) {
//			b[i]=a[i];
//			
//			System.out.println(b[i]);
//		}
//		
//		
		
		
		//Highest sum
		//------------------
		
//		Scanner sc = new Scanner(System.in);// 1,2,3,4,5 in this number highest sum is 4+5=9
//		System.out.println("enter the length");
//		int size = sc.nextInt();
//		int[] a = new int[size];
//		System.out.println("enter the value");
//		for (int i = 0; i < a.length; i++) {
//			a[i] = sc.nextInt();
//		}
//
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				if (sum < a[i] + a[j]) {
//					sum = a[i] + a[j];
//
//				}
//			}
//		}
//		System.out.println(sum);
//		
		
		
		//-----------------
		//prime number
		//-------------------
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the length");
//		int n=sc.nextInt();
//		int []a=new int[n];
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		for(int i=0;i<n;i++) {
//			int count=0;
//			int num=a[i];
//			for(int j=1;j<=num;j++) {
//				if(num%j==0) {
//					count++;
//				}
//			}
//			if(count==2) {
//				System.out.println(num);
//			}
//		}
//		System.out.println();
		
		//---------------------
		//STRING PROGRAMME
		//----------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter string");
//		String x=sc.nextLine();
//		String res="";
//		for(int i=0;i<x.length();i++) {
//			char ch=x.charAt(i);
//			int num=ch;
//			if(ch>='A'&&ch<='Z') {
//				ch=(char)(num+32);
//				res=res+ch;
//			}
//			else {
//				res=res+ch;
//			}
//		}
//		System.out.println(res);
//		
		
		
		//LOWER TO UPPER
		//--------------------
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String res="";
//		for(int i=0;i<x.length();i++) {
//			char ch=x.charAt(i);
//			int num=ch;
//			if(ch>='a'&&ch<='z') {
//				ch=(char)(ch-32);
//				res=res+ch;
//			}
//			else {
//				res=res+ch;
//			}
//		}
//		System.out.println(res);
//		
		
		//---------------------
		//reverse the string
		//---------------------
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String res="";
//		for(int i=x.length()-1;i>=0;i--) {
//			char ch=x.charAt(i);
//			res=res+ch;
//		}
//		
//		System.out.println(res);
//		
		
		//----------------
		//Palindrome
		//----------------
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String res="";
//		for(int i=x.length()-1;i>=0;i--) {
//			char ch=x.charAt(i);
//			res=res+ch;
//					
//		}
//		if(res.equals(x)) {
//			System.out.println("it is palindrome");
//		}
//		else {
//			System.out.println("not");
//		}
//		
		
		//find vowels
		//------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String res="";
//		
//			int v=0,c=0,sp=0,num=0;
//			for(int i=0;i<x.length();i++) {
//				char ch=x.charAt(i);
//			if(ch>='a'&&ch<='z') {
//			
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//				v++;
//			}
//			else {
//				c++;
//			}
//			}
//			else if(ch>='0'&&ch<='9') {
//			num++;
//		}
//			else {
//				sp++;
//			}
//			}
//		
//		    System.out.println(c);
//			System.out.println(v);
//			System.out.println(sp);
//			System.out.println(num);
		
		
		//vowels
		//-----------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String res="";
//		int v=0;
//		for(int i=0;i<x.length();i++) {
//			char ch=x.charAt(i);
//			if(ch>='a'&&ch<='z') {
//				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//					v++;
//				}
//			}
//		}
//				System.out.println("vowels:"+v);
//			
//		}
//		
//		
		
		//Two string anagram or not(pom=pom)
		//----------------------------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String s1=sc.nextLine();
//		String s2=sc.nextLine();
//		if(s1.length()!=s2.length()) {
//			System.out.println("not anagram");
//		}
//		else {
//			char ch[]=s1.toCharArray();
//			char ch1[]=s2.toCharArray();
//			Arrays.sort(ch);
//			Arrays.sort(ch1);
//			boolean flag=false;
//			for(int i=0;i<ch.length;i++) {
//				if(ch[i]==ch1[i]) {
//					flag=true;
//				}
//				else {
//					flag=false;
//					break;
//				}
//			}
//			if(flag==true) {
//				System.out.println("anagram");
//			}
//			else {
//				System.out.println("not ana");
//			}
//		}
//		
		
		
		//2D array
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter row size");
//		int row=sc.nextInt();
//		System.out.println("enter col size");
//		int col=sc.nextInt();
//		int [][]a=new int[row][col];
//		for(int i=0;i<a[i].length;i++) {
//			for(int j=0;j<a[i].length;) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a.length;j++)
//		
//		System.out.println(a[i][j]); 
		
		
		
		
		//String programme
		//----------------------
		
	Scanner sc= new Scanner(System.in);
	System.out.println("enter size");
	int n= sc.nextInt();
	int a[]=new int[n];
	
	System.out.println("enter elements");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int b[]=new int[n];
	for(int i=n-1;i>=0;i++) {
		for(int j=0;j<n-1;j++) {
			b[j]=a[i];
		}
	}
	System.out.println("reversed array is");
	for(int i=0;i<n;i++) {
		System.out.println(b[i]);
	}
		
		
		
	}
	}

	
		
		
		
		
		
		


