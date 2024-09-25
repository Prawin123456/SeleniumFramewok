package string;

import java.util.Scanner;

public class Convert_Upper_to_Lower {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String x = sc.nextLine();
		String res = "";
		for (int i = 0; i < x.length(); i++) {
			char ch = x.charAt(i);
			int num = ch;
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (num - 32);
				res = res + ch;
			} else {
				res = res + ch;
			}
		}
		System.out.println("result" + "==" + res);
	}

}
