package PagesDSalgo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.WebDriver;

public class HomePage_DS
  {
	WebDriver driver = null ;
  
  By get_start=new By.ByCssSelector(".btn");
  By click_signingIn = new By.ByLinkText("Sign in");
  By getUsers_name= new By.ByName("username");
  By getusers_password =new By.ByCssSelector("input[type='password']");
  By click_login = new By.ByCssSelector("input[type='submit']");
  
     public HomePage_DS(WebDriver driver) 
     {
		this.driver=driver;
     }
     
    public void GetStart() {
	   driver.findElement(get_start).click();
	 }
    
  public void ClickSigningIn() 
    {
	   driver.findElement(click_signingIn).click();
    }
  public void Users_name(String username)
    {
	   driver.findElement(getUsers_name).sendKeys("SDET9");
    }
  public void password(String password) 
    {
	   driver.findElement(getusers_password).sendKeys("Sdetsdet@9");
    }
  public void clickLogin()
    {
	   driver.findElement(click_login).click();
    }
   
 
  }
  


		

		
		
		
