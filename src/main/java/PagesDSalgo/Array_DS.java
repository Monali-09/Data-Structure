package PagesDSalgo;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Array_DS
	{
			WebDriver driver = null ;
			
			//arrays page and arrays in python 
			// By array_Getstarted = new By.ByXPath("/html/body/div[2]/div[2]/div/div/a");
			 By array_Getstarted = By.cssSelector(".nav-link.dropdown-toggle");
			 By select_arrays = By.xpath("//a[normalize-space()='Arrays']");
			//  By select_arrays = By.xpath("//*[@id="navbarCollapse"]/div[1]/div/div/a[5]");
			 By ArraysinPython = new By.ByXPath("/html/body/div[2]/ul[1]/a");
			 By TryHere= new By.ByXPath("/html/body/div[2]/div/div[2]/a");
			 By write = new By.ByXPath("//form[@id='answer_form']/div/div/div/textarea");			
			 By clickrun = new By.ByXPath("//*[@id=\"answer_form\"]/button");
			 	//	 By PracticeQuestions   =new By.ByXPath("//*[@id=\"content\"]/a");
		//	 By PracticeQuestions=  new By.ByCssSelector("a[class='list-group-itemlist-group-item-light.text-info']"); 
			 By PracticeQuestions= new By.ByCssSelector("a[class='list-group-item list-group-item-light text-info']");
			// By Search_thearray =new By.ByCssSelector("a[body:nth-child(2) div.list-group:nth-child(3) > a.list-group-item]");  
			// By Search_thearray= new By.ByLinkText("Search the array");
		  By Search_thearray = new By.ByXPath("//a[contains(text(),'Search the array')]");
			 
			 
	//		 By Searchthearray = new By.ByXPath("/html/body/div[2]/a");
			
			
			 //arrays using list
			 By ArraysUsingList= new By.ByXPath("/html/body/div[2]/ul[2]/a");
						 
			 //basic operations list
			 By BasicOperationsinLists= new By.ByXPath("/html/body/div[2]/ul[3]/a");
					 
			 
			 // APllications of array 
			 By ApplicationsofArray = new By.ByXPath("/html/body/div[2]/ul[4]/a");
			
			//arrays page and arrays in python 
		
		
				  public Array_DS(WebDriver driver) 
				     {
						this.driver=driver;
				     }
				  
				  public void backbutton()
				     {
					  try
					  {
					  	Thread.sleep(2000);
				    	 driver.navigate().to("https://dsportalapp.herokuapp.com/array");
					  }
					  catch(Exception ex)
					  {
						  ex.printStackTrace();
					  }
				     }
				//arrays getstarted   
				  public void array_Getstarted() 
				    {
					   driver.findElement(array_Getstarted).click();
				    }
				  				  
				  //arrays in python
				  public void ArraysinPython() 
				    {
					   driver.findElement(ArraysinPython).click();
				    }
				 			  
				   //arrays using list 
				  
				 public void TryHere() 
					 { 
						   driver.findElement(TryHere).click();
					 }
					
				
				 public String writeUp (String str) 
				     {
						 driver.findElement(write).sendKeys(str);
						 return str;
				     }		  
				 public void run()
				     {
					 try {
						 	driver.findElement(clickrun).click();
							Thread.sleep(1000);
							
						 } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
					}
					   
				     }
				 public void ArraysUsingList()
				    {
					   driver.findElement(ArraysUsingList).click();
					 
				    }
				  
					
				 //basic operations list 
				  
				  public void BasicOperationsinLists() 
				    {
					   driver.findElement(BasicOperationsinLists).click();
					 
				    }
				  		 
				  //applications of array
				  public void ApplicationsofArray()
				    {
					   driver.findElement(ApplicationsofArray).click();
				    }
				  
				  public void select_arrays()
				  {
					  driver.findElement(select_arrays).click();
				  }
				  
				  public void PracticeQuestions()
				  {
					  driver.findElement(PracticeQuestions).click();
				  }
				  
//				  public void Searchthearray()
//				  {
//					  driver.findElement(Searchthearray);
//				  }
				  
				  
				  public void Search_thearray()
				  {
					  driver.findElement(Search_thearray).click();
				  }
//						
				  
				  
		//		  @DataProvider(name = "arrayData")			 
//						 public Object[][] arrdata1() throws IOException  
//					  {
//							        String Excelpath = "C:\\Monali\\Java_Eclipse\\DSAlgo\\arrayexceldata";    
//									XSSFWorkbook workbook = new XSSFWorkbook(Excelpath);
//									System.out.println(workbook);
//									XSSFSheet getsheet = workbook.getSheet("arraydatasheet");
//									DataFormatter formatter= new DataFormatter(); 
//									
//									int rowNum = getsheet.getLastRowNum();
//									int colNum = getsheet.getRow(0).getLastCellNum();
//								//	System.out.println("the row count is " +rowNum);
//								//	System.out.println("The Column count is "+colNum);
//
//									String data[][]=new String [rowNum][colNum];
//
//									for (int i=1;i<=rowNum;i++) {
//										for(int j=0;j<colNum;j++) {
//											String parameter = (formatter.formatCellValue(getsheet.getRow(i).getCell(j)));
//											System.out.println("\n"+parameter);
//											data[i-1][j]= (formatter.formatCellValue(getsheet.getRow(i).getCell(j)));
//										}} 
//									return(data);
//							  }
//					 
//				  
//				   
				  
				  
				  
			}
