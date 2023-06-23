package jxl;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class ReadDataFromXls {
@Test
	public void TestData()
	{
	   File src =new File("E:\\venkat sai\\Selenium_Workshop\\MOCK_DATA.xls");
	   try {
		Workbook wb=Workbook.getWorkbook(src);
		Sheet sh1=    wb.getSheet(0);
		Cell  c1=sh1.getCell(3,3);
		String data1=c1.getContents();
		System.out.println(data1);
		
	} catch (BiffException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	}

	}


