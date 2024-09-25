package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ToReadFromFile {

	public static void main(String[] args) throws IOException {

		try {
		FileInputStream fin=new FileInputStream("E:\\fileHandling\\abc.txt");
		int data=fin.read();
		while(data!=-1) {
			System.out.print((char)data);
			//updation
			data=fin.read();
		}
		fin.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
