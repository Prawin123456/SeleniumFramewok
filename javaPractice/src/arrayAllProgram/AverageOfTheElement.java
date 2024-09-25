package arrayAllProgram;

import java.util.Scanner;

public class AverageOfTheElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int size=sc.nextInt();
		int[]a=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("print the average");
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			System.out.println(sum);
		}
		System.out.println("answer");
		double avg=sum/a.length;
		System.out.println(avg);
		}
		
	}


