package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataInCreatedFolder {
	
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		File f=new File("E:\\fileHandling\\Hello.txt");
	
		System.out.println("Enter the first number ");
		int a=s.nextInt();
	
		System.out.println("Enter the second number");
		int b=s.nextInt();
		
		FileOutputStream fout=null;
	    try {
			fout=new FileOutputStream(f,true);
			fout.write((char)a+b);
			fout.flush();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		finally {
			try {
				fout.close();//it throws IOexception
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
			
		
		
		
		
		
		
		
		
		

		
		
	}

}
