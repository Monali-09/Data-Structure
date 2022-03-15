package PagesDSalgo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DropDown_DS 

{
	WebDriver  driver= null;
	//select dropdown =new Select(driver.findElement(b))
			
			
			//*[@id="navbarCollapse"]/div[1]/div
			//*[@id="navbarCollapse"]/div[1]/div/a
			
	By DataStructures = new By.ByXPath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
	By arrays1 =new By.ByCssSelector("#navbarCollapse > div:nth-child(1) > div > div > a:nth-child(1)");
	By linkedlist = new By.ByXPath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[2]");
	By stack = new By.ByXPath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[3]");
	By queue = new By.ByXPath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[4]");
	By trees1 =new By.ByXPath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[5]");
	By graph2 =new By.ByXPath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[6]");
	
        	public DropDown_DS(WebDriver driver)
	          {
		        this.driver = driver;
	          }
        		
        	public void backbutton()
		        {
			         try
			        {
			  	     Thread.sleep(2000);
		    	      driver.navigate().to("https://dsportalapp.herokuapp.com/home");
			        }
			  catch(Exception ex)
			     {
				  ex.printStackTrace();
			     }
		     }
        	public void  DataStructures() 
        	{
        		driver.findElement(DataStructures).click();
        	}
            
        	public  void arrays1() 
		    {
			   driver.findElement(arrays1).click();
		    }
        	public  void linkedlist() 
		    {
			   driver.findElement(linkedlist).click();
		    }
        	public  void stack() 
		    {
			   driver.findElement(stack).click();
		    }
        	public  void queue() 
		    {
			   driver.findElement(queue).click();
		    }
        	public  void trees1() 
		    {
			   driver.findElement(trees1).click();
		    }
        	
        	public  void graph2() 
		    {
			   driver.findElement(graph2).click();
		    }
        	
        	
        	
}
