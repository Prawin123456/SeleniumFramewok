package fileHandling;

import java.io.File;

public class Createfolder2 {

	public static void main(String[] args) {

		
		File f=new File("E:fileHandling");
		String s=f.getAbsolutePath();
		
		File f1=new File(s+"\\java.txt");
		
		try {
			if(f1.createNewFile()) {
				System.out.println("file is created");
			}
			else {
				System.out.println("file is already exist");
			}
		} catch (Exception e) {
			System.out.println("ioException occured");
			// TODO: handle exception
		}
	}

}
