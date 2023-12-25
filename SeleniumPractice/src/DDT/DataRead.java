package DDT;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataRead {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		File fis=new File("./Test data DDT/data.xlsx");
		Workbook wbook=WorkbookFactory.create(fis);
		Sheet sheet=wbook.getSheet("sheet1");
		Row row=sheet.getRow(1);
		String value=row.getCell(2).toString();
		System.out.println(value);
	}

}
