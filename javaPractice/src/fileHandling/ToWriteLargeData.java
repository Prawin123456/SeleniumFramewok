package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ToWriteLargeData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File f=new File("E:\\fileHandling\\abc.txt");
		String s="Raja is not boys";
		FileOutputStream fout=new FileOutputStream(f,true);
		byte[]b=s.getBytes();
		fout.write(b);
		fout.write('\n');
		System.out.println("done");
		fout.flush();
		fout.close();
	}

}
