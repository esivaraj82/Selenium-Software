package JavaProgram;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadExcel {
	
	@Test
	public void readExcel() throws IOException, InvalidFormatException {
			
	File src = new File("./data/CreateLead.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(src);
	XSSFSheet sheet = wb.getSheetAt(0);
	int rowCount = sheet.getLastRowNum();
	int colCount = sheet.getRow(0).getLastCellNum();
	Object [][] data = new Object [rowCount][colCount];
	for (int i = 1; i <= rowCount ; i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j = 0; j < colCount; j++) {
			XSSFCell cell = row.getCell(j);
			String strCellValue = cell.getStringCellValue();
			data[i-1][j] = strCellValue;
			System.out.println(strCellValue);
		}
		
	}
	
	
	}

}
