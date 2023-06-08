package GenericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class is to use the excel data in generic way
 * @author simhadri
 *
 */

public class ExcelUtilityOhrm {
	/**
	 * This method is a generic method to fetch data from Excel
	 * @param SheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws exception
	 *
	 */
	public String GetDataFromExcel(String SheetName, int rowNum, int cellNum) throws Exception{
		FileInputStream fis = new FileInputStream("C:\\Users\\schat\\selenium\\SampleProjectTestCases.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(SheetName);
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return value;
		
	}
}
