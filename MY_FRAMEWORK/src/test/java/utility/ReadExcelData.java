package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelData {

	   @DataProvider(name="bvtdata")
        public String[][] getdata(Method m) throws EncryptedDocumentException, IOException 
	   {
	   	
		 String excelSheetName=m.getName();
		 File f=new File(System.getProperty("C:\\Users\\admin\\eclipse-workspace\\MY_FRAMEWORK\\src\\test\\resources\\testdata\\testdata.xlsx"));
	     FileInputStream fis=new FileInputStream(f);
	     Workbook wb=WorkbookFactory.create(fis);
	     Sheet sheetname=wb.getSheet(excelSheetName);
	     
	     
	     int totalRows=sheetname.getLastRowNum();
	     System.out.println(totalRows);
	     Row rowCells=sheetname.getRow(0);
	     int totalCols=rowCells.getLastCellNum();
	     System.out.println(totalCols);
	     
	     DataFormatter formate=new DataFormatter();
	     
	     String testdata[][]=new String[totalRows][totalCols];
	     for(int i=0;i<=totalRows;i++) {
	    	 for(int j=0;j<totalCols;j++) {
	    		 testdata[i-1][j]=formate.formatCellValue(sheetname.getRow(i).getCell(j));
	    	     System.out.println(testdata[i-1][j]);
	    	 
	    	 
	    	 }
	     }
	     
	     return testdata;
	     
	}
}
