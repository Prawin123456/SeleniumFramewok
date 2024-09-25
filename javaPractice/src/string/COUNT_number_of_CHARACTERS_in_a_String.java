package string;

import java.util.Scanner;

public class COUNT_number_of_CHARACTERS_in_a_String {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String x=sc.nextLine();
		String res=" ";
		int v=0,c=0,sp=0,num=0;
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
				else if(ch>='0'&&ch<='9') {
					num++;
				}
				else {
					sp++;
					
				}
			}
		System.out.println("vowel=" +v);
		System.out.println("consonant="+c);
		System.out.println("specialcharacter="+sp);
		System.out.println("number="+num);
		}
		
	}

