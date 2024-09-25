package arrayAllProgram;

import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the lenth of a");
		int size1 = sc.nextInt();
		int[] n = new int[size1];
		System.out.println("enter the lenth of b");
		int size2 = sc.nextInt();
		int[] m = new int[size2];
		int size3 = sc.nextInt();
		int[] d = new int[size3];
		int temp=0,temp1=0;
		System.out.println("enter the value of a");
		for (int i = 0; i < size1; i++) {
			n[i] = sc.nextInt();
		}
		System.out.println("enter the value of b");
		for (int i = 0; i < size2; i++) {
			m[i] = sc.nextInt();
		}
		for (int i = 0; i < size3; i++) {
			if(temp<size1) {
				d[i]=n[temp];
				temp++;
			}
			else {
				d[i]=m[temp1];
				temp1++;
			}
			
		}
		System.out.println("print the array");
		for(int i=0;i<size3;i++)
		{
			System.out.println(d[i]);
		}
	}

}
