package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String fetchDataFromExcelSheet(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\do.timetracking.actitime.automation\\src\\main\\resources\\excelData.xlsx");
	//load the java representation of excel file
	Workbook workbook = WorkbookFactory.create(fis);
	
	return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
	}

}
