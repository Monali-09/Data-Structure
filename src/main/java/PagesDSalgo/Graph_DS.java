package PagesDSalgo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.WebDriver;

public class Graph_DS
{
		WebDriver driver = null ;		
	
		
		 By graph_Getstarted = By.cssSelector(".nav-link.dropdown-toggle");
		 By select_graph = By.xpath("//a[normalize-space()='Graph']");
	//	 By graph_Getstarted = new By.ByXPath("/html/body/div[2]/div[7]/div/div/a");
		 By graph= new By.ByXPath("/html/body/div[2]/ul[2]/a");
		 By TryHere= new By.ByXPath("/html/body/div[2]/div/div[2]/a");
		 By write = new By.ByXPath("//form[@id='answer_form']/div/div/div/textarea");			
		 By clickrun = new By.ByXPath("//*[@id=\"answer_form\"]/button");
		 By graphRepresentations =new By.ByXPath("/html/body/div[2]/ul[3]/a");
		// /html/body/div[2]/ul[3]/a
		 
		  public Graph_DS(WebDriver driver) 
		  
		     {
				this.driver=driver;
		     }
		  
		  public void backbutton()
		     {
			      try
			   {
			  	  Thread.sleep(1000);
		    	  driver.navigate().to("https://dsportalapp.herokuapp.com/graph");
			   }
			     catch(Exception ex)
			  {
				  ex.printStackTrace();
			  }
		   }
		  
		  public void graph_Getstarted() 
		    {
			   driver.findElement(graph_Getstarted).click();
		    }
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
		     try
		      {
			 	driver.findElement(clickrun).click();
				Thread.sleep(1000);
			  } 
		     catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
	     }
		 
		 public void graph()
		 {
			 driver.findElement(graph).click();
		 }
		 
		 public void graphRepresentations()
		 {
			 driver.findElement(graphRepresentations).click();
		 }
		 
		  
		  public void select_graph()
		  {
			  driver.findElement(select_graph).click();
		  }
}
	

