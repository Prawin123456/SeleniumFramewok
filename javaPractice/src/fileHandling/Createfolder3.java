package fileHandling;

import java.io.File;

public class Createfolder3 {

	public static void main(String[] args) {

		//folder inside folder we create new file Hello
		
		File f=new File("E:\\fileHandling\\Hello.txt");
		System.out.println(f.exists());
		
		try {
			System.out.println(f.createNewFile());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.getName());
			System.out.println(f.length());


			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
