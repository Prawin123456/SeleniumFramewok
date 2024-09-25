package string;

import java.util.Scanner;

public class Cnvert_UPPER_CASE_TO_LOWER_CASE_VICE_VERSA {

	public static void main(String[] args) {
       
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String x=sc.nextLine();
		String res=" ";
		for(int i=0;i<x.length();i++) {//
			char ch=x.charAt(i);//
			int num=ch;
			if(ch>='A'&&ch<='Z') {
				ch=(char)(num+32);
				res=res+ch;
			}
			else {
				res=res+ch;
			}
		}
		System.out.println("result"+"=="+res);
		}

}


//mY NaMe is PrAwIn
//result== my name is prawin*/
		
		
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String x=sc.nextLine();
		String res=" ";
		for(int i=0;i<x.length();i++) {
			char ch=x.charAt(i);
			int num=ch;
			if(ch>='a' && ch<='z'){
				ch=(char)(num-32);
				res=res+ch;
				
			}
			else {
				res=res+ch;
			}
			
		}
		System.out.println("result"+"=="+res);
	}
	}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String x=sc.nextLine();
		String res=" ";
		for(int i=0;i<x.length();i++) {
			char ch=x.charAt(i);
			int num=ch;
			if(ch>='A'&&ch<='Z') {
				ch=(char)(num-32);
				res=res+ch;
			}
			else {
				res=res+ch;
			}
		}
		System.out.println("result"+"="+res);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


