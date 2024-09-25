package string;

import java.util.Arrays;
import java.util.Scanner;

public class RevrseWord {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		
		String s=sc.nextLine();
		String s1 []=s.split(" ");
	    System.out.println(Arrays.toString(s1));
		
		String res=" ";
		for(int i=0;i<s1.length;i++) {
			String word=s1[i];
			
			for(int j=word.length()-1;j>=0;j--) {
				res=res+word.charAt(j);
			}
			}
	      System.out.println(res);
			}
         }
		
	


