package dataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel
{

	public static void main(String[] args) throws IOException
	{
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\Testdata\\writedata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("vaibhav");
		row1.createCell(1).setCellValue(1234);

		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("vaibhav");
		row2.createCell(1).setCellValue(1234);

		workbook.write(file);
		workbook.close();
		file.close();
	}

}
