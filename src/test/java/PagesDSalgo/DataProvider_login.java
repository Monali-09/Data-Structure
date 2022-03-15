package PagesDSalgo;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_login 
{
	static WebDriver driver= null;
  @DataProvider(name ="data_for _login")
  public Object[] dataforlogin() throws IOException
      {
	  String Excelpath = "C:\\Monali\\Java_Eclipse\\DSAlgo\\arrayexceldata\\arraydatasheet.xlsx";    
			XSSFWorkbook workbook = new XSSFWorkbook(Excelpath);
			System.out.println(workbook);
			XSSFSheet getsheet = workbook.getSheet("login");
			DataFormatter formatter= new DataFormatter(); 
			
			int rowNum = getsheet.getLastRowNum();
			int colNum = getsheet.getRow(0).getLastCellNum();
		//	System.out.println("the row count is " +rowNum);
		//	System.out.println("The Column count is "+colNum);

			String data[][]=new String [rowNum][colNum];

			for (int i=1;i<=rowNum;i++) {
				for(int j=0;j<colNum;j++) {

					String parameter = (formatter.formatCellValue(getsheet.getRow(i).getCell(j)));
					System.out.println("\n"+parameter);
					data[i-1][j]= (formatter.formatCellValue(getsheet.getRow(i).getCell(j)));
				}} 
			return(data);
	  }
  @DataProvider(name ="data_for _login")
  public void Loginds(String Username,String Password, String Usearray,String Uselist,String UsingBol, String Usingapplication)
  {
	  driver= new ChromeDriver();
	  driver.get("https://dsportalapp.herokuapp.com/");
	  HomePage_DS array= new HomePage_DS(driver);
	//  array.Go_To_HomePage(Username,Password);
	  driver.manage().window().maximize();
	  
  }
  }

