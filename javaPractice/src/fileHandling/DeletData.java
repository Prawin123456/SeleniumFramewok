package fileHandling;

import java.io.File;
import java.io.FileInputStream;

public class DeletData {

	public static void main(String[] args) {
		
		File f=new File("E:\\FileHandling\\abc.txt");
		if(f.delete()) {
			System.out.println("file is deleted");
		}
		else {
			System.out.println("file not present");
		}

	}

}
