package InterviewPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetValueFromExcel {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 
		String filepath="";
		//FileInputStream fis= new FileInputStream(filepath);
		
FileInputStream fis = new FileInputStream(filepath);
		
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh= (Sheet) wb.getSheet("Sheet1");
		Row r = ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(0);
		Cell c = r.getCell(0);
		String cellval =c.getStringCellValue();
		System.out.println(cellval);
		 
		 
		
	}
}
