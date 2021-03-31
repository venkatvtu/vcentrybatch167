package excelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSingleCellTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\vcentry\\batch167\\A9_FileHandlingTest\\File\\Test.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Home");
		String data = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
		
		
		
		
	}

}
