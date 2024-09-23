package InterviewPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadValueFromexcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		String filePath="C:\\Users\\Dhanyasri\\Desktop\\test.xlsx";
		FileInputStream fis= new FileInputStream(filePath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet("Sheet1");
		Row r=sh.getRow(0);
		Cell c=r.getCell(0);
		String cellval=c.getStringCellValue();
		System.out.println(cellval);
		
	}

}
