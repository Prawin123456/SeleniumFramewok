package fileHandling;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {

		
		File f=new File("E:fileHandling");
		if(f.mkdir()) {
			System.out.println("folder is created");
		}
		else {
			System.out.println("folder already exist");
		}
		if(f.exists()) {
			System.out.println("file is present");
		}
		else {
			System.out.println("file is not present");
		}
	}

}
