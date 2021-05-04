package CaseStudy;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	String FileName="C:\\\\BinduWorkspace\\\\TestDAta.xlsx";
	String SheetName ="Login";
	File f1=new File(FileName);
	FileInputStream inputStream = new FileInputStream(f1);
	String fileEtensionName = FileName.substring(FileName.indexOf("."));
	Workbook workbook = null;
	if (fileEtensionName.equals(".xlsx"))
		workbook=new XSSFWorkbook(inputStream);
	else if (fileEtensionName.equals(".xls"))
		workbook = new HSSFWorkbook(inputStream);
	
	Sheet sh=workbook.getSheet(SheetName);
	int rowcnt = sh.getPhysicalNumberOfRows();
	
	sh.createRow(rowcnt).createCell(0).setCellValue("Bindu");
	sh.createRow(rowcnt).createCell(0).setCellValue("Shree");
	sh.createRow(rowcnt).createCell(0).setCellValue("BRCC");
	sh.createRow(rowcnt).createCell(0).setCellValue("QA");
}
catch(Exception e) {
	e.printStackTrace();

	}

}
}
