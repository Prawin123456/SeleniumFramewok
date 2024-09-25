package fileHandling;

import java.io.File;

public class Createfolder4 {

	public static void main(String[] args) {

		
		File f= new File("E:\\fileHandling");
		String[]str=f.list();
		for(String s:str) {
			System.out.println(s);
		}
		System.out.println("no of files"   +str.length);
	}

}
