package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getData(String sheetname, int r, int c) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\ZerodhaKite\\src\\test\\resources\\yogesh.xlsx");
		String s=WorkbookFactory.create(file).getSheet(sheetname).getRow(r).getCell(c).getStringCellValue();		
		return s;
	}

}
