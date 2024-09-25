package string;

import java.util.Arrays;
import java.util.Scanner;

public class String_is_PANAGRAM_or_not {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the String");
		 * String x1 = sc.nextLine(); String x2 = sc.nextLine(); if (x1.length() !=
		 * x2.length()) { System.out.println("not an anagram"); } else { char[] ch =
		 * x1.toCharArray(); char[] ch1 = x2.toCharArray(); Arrays.sort(ch);
		 * Arrays.sort(ch1); boolean flag = false; for (int i = 0; i < ch.length; i++) {
		 * if (ch[i] == ch1[i]) { flag = true; } else { flag = false; break;
		 * 
		 * } } if (flag == true) {
		 * System.out.println("The given two strings are annagram"); } else {
		 * System.out.println("the given two string not anagram");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter the String");
		 * String x1=sc.nextLine(); String x2=sc.nextLine();
		 * if(x1.length()!=x2.length()) { System.out.println("not anagram"); } else {
		 * char[]ch=x1.toCharArray(); char[]ch1=x2.toCharArray(); Arrays.sort(ch);
		 * Arrays.sort(ch1); boolean flag=false; for(int i=0;i<ch.length;i++) {
		 * if(ch[i]==ch1[i]) { flag=false; } else { flag=true; break; } } if(flag==true)
		 * { System.out.println("ana"); } else { System.out.println("not ana"); } }
		 */

		// listen==silent
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String x1 = sc.nextLine();
		String x2 = sc.nextLine();
		if (x1.length() != x2.length()) {
			System.out.println("string is not anagram");
		} else {
			char[] ch = x1.toCharArray();
			char[] ch1 = x2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			boolean flag = false;
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == ch1[i]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println("anagram");
			} else {
				System.out.println("not anagrampot");
			}
		}

	}

}
