 package number;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		int fact=1;
        for(int i=n;i>=1;i--)
        {
        	fact=fact*i;
        	}
        System.out.println(fact);
	}

}
