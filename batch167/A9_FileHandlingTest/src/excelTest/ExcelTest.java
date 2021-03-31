package excelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\vcentry\\batch167\\A9_FileHandlingTest\\File\\Test.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // xlsx
		//HSSFWorkbook workbook = new HSSFWorkbook(); xls
		XSSFSheet sheet = workbook.getSheet("Home");
		int row = sheet.getLastRowNum()+1;
		//XSSFRow r =sheet.getRow(0);
		//int column = r.getLastCellNum();
		int column = sheet.getRow(0).getLastCellNum();
		System.out.println("total row- "+row);
		System.out.println("total column - "+column);
	
	
	}

}
