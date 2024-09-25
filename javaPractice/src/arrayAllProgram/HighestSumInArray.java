package arrayAllProgram;

import java.util.Scanner;

public class HighestSumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);// 1,2,3,4,5 in this number highest sum is 4+5=9
		System.out.println("enter the length");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("enter the value");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (sum < a[i] + a[j]) {
					sum = a[i] + a[j];

				}
			}
		}
		System.out.println(sum);
	}

}
