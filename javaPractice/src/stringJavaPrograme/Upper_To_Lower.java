package stringJavaPrograme;

import java.util.Arrays;
import java.util.Scanner;

public class Upper_To_Lower {

	private static int count;

	public static void main(String[] args) {

	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter the text");
		String x=sc.nextLine();
		String res="";
		System.out.println("the answer is:");
		for(int i=0;i<x.length();i++) {
			char ch=x.charAt(i);
			int num=ch;
			if(ch>='A'&&ch<='Z') {
				ch=(char)(ch+32);
				res=res+ch;
			}
			else {
				res=res+ch;
			}
			
		}
		System.out.println(res);
		
		
		
		//Lower to Upper

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String x=sc.nextLine();
		String res="";
		System.out.println("The answer is:");
		for(int i=0;i<x.length();i++) {
			char ch=x.charAt(i);
			int num=ch;
			if(ch>='a' && ch<='z') {
				ch=(char)(ch-32);
				res=res+ch;
			}
			else {
				res=res+ch;
			}
		}
		System.out.println(res);
			
         
         
         //reverse the string
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String x=sc.nextLine();
		String res="";
		for(int i=x.length()-1;i>=0;i--) {
			char ch=x.charAt(i);
			res=res+ch;
		}
		System.out.println("the enswer is:");
		System.out.println(res);
		
		
		//PALINDROME
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String x=sc.nextLine();
		String res="";
		for(int i=x.length()-1;i>=0;i--) {
			char ch=x.charAt(i);
			res=res+ch;
		}
		if(x.equals(res)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrom");
		}
		
		
		
		// FIND CONSONANT,VOWEL,NUMBER,SP CH
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String x=sc.nextLine();
		String res="";
		int v=0,c=0,num=0,sp=0;
		for(int i=0;i<x.length();i++) {
			char ch=x.charAt(i);
			if(ch>='a'&&ch<='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					v++;
				}
				else {
					c++;
				}
			}
			
				else if(ch>='0' && ch<='9') {
					num++;
					
				}
				else {
					sp++;
				}
			}
			System.out.println("vowel"+"="+v);
			System.out.println("consonant"+"="+c);
			System.out.println("number"+"="+num);
			System.out.println("special ch"+"="+sp);

		
		   //only vowels
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String x=sc.nextLine();
		String res="";
		int v=0,c=0;
		for(int i=0;i<x.length();i++) {
			char ch=x.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				c++;
			}
			else {
				v++;
			}
		}
		}
		System.out.println("vowel"+"="+v);
		System.out.println("consonant"+"="+c);
		
		
		
		
		//print dublicate
		//----------------
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("Enter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println("The answer is:");
				System.out.println(a[i]);
			}
		}
				
		
		//remove the dublicate
		//----------------------
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("Enter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The answer is:");
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=i;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(a[i]);
			}
		}
		
		
		//Print distinct element
		//-----------------------
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("Enter the value");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The answer is:");
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
		}
		
		
		
		//STRING PROGRAMME
		//-----------------
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String x=sc.nextLine();
		String res="";
		for(int i=0;i<x.length();i++) {
			char ch=x.charAt(i);
			int num=ch;
			if(ch>='A'&&ch<='Z') {
				ch=(char)(num+32);
				res=res+ch;
			}
			else {
				res=res+ch;
				
			}
		}
		System.out.println("The answer is:");
		System.out.println(res);
		
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String x=sc.nextLine();
		String res="";
		for(int i=0;i<x.length();i++) {
			char ch=x.charAt(i);
			int num=ch;
			if(ch>='a'&&ch<='z') {
				ch=(char)(num-32);
			    res=res+ch;
		        }
			     else {
				res=res+ch;
			}
		}
			System.out.println(res);
		
		
		//REVERSE GIVEN STRING
		//------------------------
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String x=sc.nextLine();
		String res="";
		for(int i=x.length()-1;i>=0;i--) {
			char ch=x.charAt(i);
			System.out.print(ch);
		}
		
		
		//pallindromme
		//----------------------
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String x=sc.nextLine();
		String res="";
		for(int i=x.length()-1;i>=0;i--) {
			char ch=x.charAt(i);
			res=res+ch;
		}
		if(x.equals(res)) {
			System.out.println("palindromme");
		}
		else {
			System.out.println("not pallindrome");
		}
	
		
		
		
		
		//vowels.consonant,special charactr and number
		//----------------------------------------------
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String x=sc.nextLine();
		String res="";
		int v=0,c=0;
		for(int i=0;i<x.length();i++) {
			char ch=x.charAt(i);
			if(ch>='a'&& ch<='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					c++;
				}
				else {
					v++;
				}
			}
			}
			System.out.println("vowel"+"="+v);
			System.out.println("consonant"+"="+c);
		
		
		
		
		//Anagram
		//-------------
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		//String res="";
		if(s1.length()!=s2.length()) {
			System.out.println("not anagaram");
		}
		else {
			char ch[]=s1.toCharArray();
			char ch1[]=s2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
		    
		    boolean flag=false;
		    for(int i=0;i<ch.length;i++) {
			if(ch[i]==ch1[i]) {
				flag=true;
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("ana");
		}
		else {
			System.out.println("not");
		}
	}

		
		//count character
		//---------------
		
		//fetch first letter in ever word
		//-----------------------------------
		//my name is pawin
		//mnip
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String x=sc.nextLine();
		char s[]=x.toCharArray();
		System.out.println("first character");
		for(int i=0;i<=x.length()-1;i++) {
			char ch=x.charAt(i);
			if(s[i]!=' '&&(i==0||s[i-1]==' ')){
				System.out.print(s[i]+" ");
			}
		}
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String x=sc.nextLine();
		char s[]=x.toCharArray();
		System.out.println();
		for(int i=0;i<=x.length()-1;i++) {
			char ch=x.charAt(i);
			if(s[i]!=' '&&(i==0||s[i-1]==' ') ){
				
				
			}
		}
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String x=sc.nextLine();
		char s[]=x.toCharArray();
		System.out.println("first character");
		for(int i=0;i<=x.length()-1;i++) {
			char ch=x.charAt(i);
			if(s[i]!=' '&&(i==0||s[i-1]==' ')){
				System.out.print(s[i]+" ");
			}
		}
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String x=sc.nextLine();
		char s[]=x.toCharArray();
		System.out.println("anwer is:");
		for(int i=0;i<=x.length()-1;i++) {
			char ch=x.charAt(i);
			if(s[i]!=' '&&(i==0||s[i-1]==' ')) {
				System.out.print(s[i]);
			}
		}
		
		
	//print distinct character
	//	banana=b
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String x=sc.nextLine();
	String s="";
	for(int i=0;i<x.length();i++) {
		char ch=x.charAt(i);
		
		int count=1;
		if(s.indexOf(ch)==-1) {
			for(int j=i+1;j<x.length();j++) {
				char ch1=x.charAt(j);
				if(ch==ch1) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(ch);
				}
			s=s+ch;
			}
		}
		
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String x=sc.nextLine();
		String s="";
		for(int i=0;i<x.length();i++) {
			char ch=x.charAt(i);
			
			int count=1;
			if(s.indexOf(ch)==-1) {
				for(int j=i+1;j<x.length();j++) {
					char ch1=x.charAt(j);
					if(ch==ch1) {
						count++;
						
					}
				}
				if(count==1) {
					System.out.println(ch);
				}
				s=s+ch;
			}
		}
		
		*/
		
		//count character
		//---------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String s="";
//		for(int i=0;i<x.length();i++) {
//			char ch=x.charAt(i);
//			int count=1;
//		
//		if(s.indexOf(ch)==-1) {
//		for(int j=i+1;j<x.length();j++) {
//				char ch1=x.charAt(j);
//			
//				if(ch==ch1) {
//					count++;
//				}
//			}
//		if(count==1) {
//			System.out.println(ch);
//		}
//		s=s+ch;
//		}
//		}
//		
		
		//print distinct character
		//----------------------------
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter string");
//		String x=sc.nextLine();
//		String res="";
//		for(int i=0;i<x.length();i++) {
//			char ch=x.charAt(i);
//			int count=1;
//			if(res.indexOf(ch)==-1) {
//				for(int j=i+1;j<x.length();j++) {
//					char ch1=x.charAt(j);
//					if(ch==ch1) {
//						count++;
//					}
//				}
//					if(count==1) {
//						System.out.println(ch);
//					}
//				
//				res=res+ch;
//			}
//		
//		}
		
		
	
		//Print dublicate
		//-------------------
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String res="";
//		for(int i=0;i<x.length();i++) {
//			char ch=x.charAt(i);
//			int count=1;
//			if(res.indexOf(ch)==-1) {
//				for(int j=i+1;j<x.length();j++) {
//					char ch1=x.charAt(j);
//					if(ch==ch1) {
//						count++;
//					}
//				}
//					if(count>1) {
//						System.out.println(ch);
//					}
//				
//				res=res+ch;
//			}
//		}
//		output=an
		
		//remove dublicTE
		//--------------------
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String res="";
//		for(int i=0;i<x.length();i++) {
//			char ch=x.charAt(i);
//			int count=1;
//			if(res.indexOf(ch)==-1) {
//				for(int j=i+1;j<x.length();j++) {
//					char ch1=x.charAt(j);
//					if(ch==ch1) {
//						count++;
//					}
//					
//				}
//				res=res+ch;
//			}
//		}
//		System.out.println(res);
//		output=ban
		
		
		
		//count words
		//------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter string");
//		String x=sc.nextLine();
//		String []s=x.split(" ");
//		System.out.println(Arrays.toString(s));
//		System.out.println(s.length);
		
		
		//Count Words
		//----------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String []s=x.split(" ");
//		System.out.println(Arrays.toString(s));
//		System.out.println(s.length);
//		
		
		
		//Reverse each words
		//-------------------
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String []s=x.split(" ");
//		System.out.println(Arrays.toString(s));
//		String res="";
//		for(int i=0;i<s.length;i++) {
//            String word=s[i];
//            for(int j=word.length()-1;j>=0;j--) {
//            	res=res+word.charAt(j);
//            }
//            res=res+" ";
//		}
//		System.out.println(res);
//		
//		
		//reverse last word
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the string");
//		String x=sc.nextLine();
//		String []s=x.split(" ");
//		String word=s[s.length-1];
//		String rev="";
//		for(int i=word.length()-1;i>=0;i--) {
//			char ch=word.charAt(i);
//			rev=rev+ch;
//		}
//		String res="";
//		s[s.length-1]=rev;
//		for(int i=0;i<s.length;i++) {
//			res=res+s[i]+" ";
//		}
//		System.out.println(res);
//		}
		
		
		//Arrange number and alphabet
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter string");
//		String x=sc.nextLine();
//		String res="";
//		int alp=0;
//		String num=0;
//		for(int i=0;i<x.length();i++) {
//			char ch=x.charAt(i);
//		if(ch>='0'&&ch<='9') {
//			num=num+ch;
//		}
//		}
//		int alp=0,num=0;
//		
//		char ch=x.charAt(i);
//		
		
		
		//in=java123
		//out=6
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String x=sc.nextLine();
		int alp=0;
		int num=0;
		int sum=0;
		for(int i=0;i<x.length();i++) {
			char ch=x.charAt(i);
			if(ch>='0'&&ch<='9') {
				sum=sum+ch-'0';
			}
		}
			System.out.println(sum);
		}
	}

				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


