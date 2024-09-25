package utility;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Readpropertyfiles {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\MY_FRAMEWORK\\src\\test\\resources\\configfiles\\config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
	    System.out.println(prop.getProperty("testurl"));
	}

}
