package PagesDSalgo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.WebDriver;

public class Data_StrutureDS {
		WebDriver driver = null;
		
		
		 By  DataStructuresGetStart = By.cssSelector(".nav-link.dropdown-toggle");
		 By select_ds = By.xpath("//a[normalize-space()='Ds']");
		 By TimeComplexity = new By.ByClassName("list-group-item");
		 By TryHere= new By.ByXPath("/html/body/div[2]/div/div[2]/a");
		 By write = new By.ByXPath("//form[@id='answer_form']/div/div/div/textarea");			
		 By clickrun = new By.ByXPath("//*[@id=\"answer_form\"]/button");
		 
		
		 public Data_StrutureDS(WebDriver driver) 
	     {
			this.driver=driver;
	     }
		 			  
		  public void backbutton()
    	  {
			  try
			  {
			  	Thread.sleep(2000);
		    	 driver.navigate().to("https://dsportalapp.herokuapp.com/data-structures-introduction");
			  }
			  catch(Exception ex)
			  {
				  ex.printStackTrace();
			  }
			}
		  
			public void DataStructuresGetStart() 
			{
			   driver.findElement(DataStructuresGetStart).click();
			}
			
			public void TimeComplexity()
			{
				driver.findElement(TimeComplexity).click();
			}
			
			public void TryHere() 
			{
				driver.findElement(TryHere).click();
			}				
			
			public  void writeUp() 
		    {
				 driver.findElement(write).sendKeys("print 'Data Structure Introduction'");
				 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		     }		  
				 public void run()
			     {
				   driver.findElement(clickrun).click();
			     }
}			  


