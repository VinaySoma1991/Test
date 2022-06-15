package utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider() {
		
		File src=new File("./Data/Data.xlsx");
		try {
			FileInputStream fl=new FileInputStream(src);
			wb=new XSSFWorkbook(fl);
		} catch (Exception e) {
			System.out.println("Excel not found"+e.getMessage());
			
		} 
		
	}
	
	public String GetStringData(String sheetName,int row,int col) {
		return wb.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
	}
		
		public double GetNumaricData(String sheetName,int row,int col) {
			return wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue();
		
	}

}
