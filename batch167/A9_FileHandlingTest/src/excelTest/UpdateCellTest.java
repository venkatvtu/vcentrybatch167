package excelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateCellTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\vcentry\\batch167\\A9_FileHandlingTest\\File\\update.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Home");

		int row = sheet.getLastRowNum() + 1;
		int column = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data + "  ");

			}
			System.out.println();
		}
		fis.close();
		//update excel. and also excel file should not be open.
		FileOutputStream fos = new FileOutputStream(f);
		sheet.getRow(1).getCell(2).setCellValue("guindy");
		sheet.getRow(0).getCell(0).setCellValue(true);
		sheet.getRow(0).getCell(1).setCellValue(1);
		
		workbook.write(fos);
		fos.close();
		
		
	}

}
