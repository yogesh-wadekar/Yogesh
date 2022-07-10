package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

import utility.Excel;

public class DataProviderFile {
	String v1,v2;
	@DataProvider (name="yogesh")
	public Object[][] getData()
	{
		return new Object[][] {{"YA9863","yogesh2709"}};
	}
	
	@DataProvider (name="wadekar")
	public Object[][] getExcelData() throws EncryptedDocumentException, IOException
	{
		v1=Excel.getData("crediential", 1, 1);
		v2=Excel.getData("credential", 1, 2);
		Object[][] value= {{v1,v2}};
		return value;
	}

}
