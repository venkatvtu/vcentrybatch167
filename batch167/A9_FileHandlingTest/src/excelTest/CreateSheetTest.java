package excelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheetTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\vcentry\\batch167\\A9_FileHandlingTest\\File\\create.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.createSheet("vcentry");
		XSSFRow row  = sheet.createRow(1);
		XSSFCell cell = row.createCell(1);
		cell.setCellValue("new data");
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
		
		
		
		
	}

}
