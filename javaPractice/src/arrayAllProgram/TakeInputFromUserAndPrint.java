package arrayAllProgram;

import java.util.Scanner;

public class TakeInputFromUserAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt();//here giving input
		System.out.println("enter the value");
		int[]a=new int[s1];//here storing the value in array
		
		
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		System.out.println(a[i]);
		}
		
	}

}
