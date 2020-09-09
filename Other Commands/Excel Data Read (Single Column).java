package special_commands;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Execl_Data_Read {

	public static void main(String[] args) throws IOException {
		/* This is a special method where we can read the data from excel sheet. we can also use this code for 
		future use*/
		
		File file=new File("D:\\Selenium\\Excel Data Extract method\\Data Extract.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rows=sheet1.getLastRowNum();
		
		for(int i = 0; i<=rows; i++)
		{
			String data=sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(data);
			
		}
		
		
		wb.close();

	}

}
