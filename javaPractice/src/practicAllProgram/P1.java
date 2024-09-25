package practicAllProgram;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the array");
	    int n=sc.nextInt();
	    int []a=new int[n];
	    System.out.println("answer is");
	    for(int i=0;i<a.length;i++) {
	    	a[i]=sc.nextInt();
	    }
	    for(int i=0;i<a.length;i++) {
	    	System.out.println(a[i]+" ");
	    }
	}

}
