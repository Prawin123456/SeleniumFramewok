package hackerRank;

import java.util.Scanner;

public class code1 {

		private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        if((N%2==0&&N>2&&N<5)||N>20){
	            System.out.println("Not wierd");
	        }
	        else if(N>=6||N<20)
	        {
	            System.out.println("wierd");
	        }
	        else{
	            System.out.println("wierd");
	        }
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        scanner.close();
	}

}
