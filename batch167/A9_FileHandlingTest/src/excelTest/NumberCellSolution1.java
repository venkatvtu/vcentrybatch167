package excelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NumberCellSolution1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\vcentry\\batch167\\A9_FileHandlingTest\\File\\Number.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Home");

		int row = sheet.getLastRowNum() + 1;
		int column = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {
				sheet.getRow(i).getCell(j).setCellType(Cell.CELL_TYPE_STRING);
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data + "  ");
				//String a="5";
			}
			System.out.println();
		}
		
		
		
	}

}
