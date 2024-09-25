package practicAllProgram;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
			}
			System.out.println(sum+"");
		}
	}


