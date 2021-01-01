package Activity_13_1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Activity_13_1 {
	public void writeExcel(String filePath) throws IOException
	{
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet =workbook.createSheet("Sheet1");
		List<String[]> data =new ArrayList<String[]>();
		String[] heading= {"ID","First Name","Last Name","Email","ph.no"};
		String[] row1= {"1","Satvik","Shah","satshah@example.com","4537829158"};
		String[] row2= {"2","Avinash","Kati","avinash.k@example.com","4892184058"};
		String[] row3= {"3","Lahri","Rath","lahri.rath@example.com","4528727830"};
		data.add(heading);
		data.add(row1);
		data.add(row2);
		data.add(row3);
		int rownum=0;
		for (String[] rowData:data )
		{
			Row row =sheet.createRow(rownum++);
			int cellnum=0;
			for (String cellData:rowData)
			{
				Cell cell =row.createCell(cellnum++);
				cell.setCellValue(cellData);
			}
		}
		
		try {
			FileOutputStream out =new FileOutputStream(new File(filePath));
			workbook.write(out);
			out.close();
			workbook.close();
		}
		catch(Exception e) {e.printStackTrace();}
	}

}
