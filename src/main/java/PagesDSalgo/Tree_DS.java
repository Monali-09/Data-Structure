package PagesDSalgo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.WebDriver;

public class Tree_DS {
		WebDriver driver = null ;
		
		//Trees getting started
			 By treeGetstarted = new By.ByXPath("/html/body/div[2]/div[6]/div/div/a");
            // By treeGetstarted=
			 By OverviewofTrees=new By.ByXPath("/html/body/div[2]/ul[1]/a");
			 By write = new By.ByXPath("//form[@id='answer_form']/div/div/div/textarea");			
			 By clickrun = new By.ByXPath("//*[@id=\"answer_form\"]/button");
			 By TryHere= new By.ByXPath("/html/body/div[2]/div/div[2]/a");
			 
			 By Terminologies= new By.ByXPath("/html/body/div[2]/ul[2]/a");
						 
			 By TypesOfTrees = new By.ByXPath("/html/body/div[2]/ul[3]/a");
					 
			 By TreeTraversals= new By.ByXPath("/html/body/div[2]/ul[4]/a");
			
			 By TraversalsIllustration = new By.ByXPath("/html/body/div[2]/ul[5]/a");
						
			 By BinaryTrees = new By.ByXPath("/html/body/div[2]/ul[7]/a");
			
			 By TypesofBinaryTrees= new By.ByXPath("/html/body/div[2]/ul[7]/a");
			 
			 By ImplementationinPython=  new By.ByXPath("/html/body/div[2]/ul[8]/a");
			
			 By BinaryTreeTraversals= new By.ByXPath("/html/body/div[2]/ul[9]/a");
			
			 By ImplementationofBinaryTrees= new By.ByXPath("/html/body/div[2]/ul[10]/a");
			
			 By ApplicationsofBinarytrees = new By.ByXPath("/html/body/div[2]/ul[11]/a");
		
			 By BinarySearchTrees =new By.ByXPath("/html/body/div[2]/ul[12]/a");
			
			 By ImplementationOfBST= new By.ByXPath("/html/body/div[2]/ul[13]/a");
			 			
			 By PracticeQuestions =new By.ByXPath("/*[@id=\"content\"]/a");
		 
			
					 			 
			 public Tree_DS(WebDriver driver) 
		     {
				this.driver=driver;
		     }
			 public void backbutton()
			     {
				  try
				   {
				  	Thread.sleep(1000);
			    	 driver.navigate().to("https://dsportalapp.herokuapp.com/tree");
				   }
				  catch(Exception ex)
				   {
					  ex.printStackTrace();
				   }
			     }
			 
			 public void TreeStart() 
			 {
				   driver.findElement(treeGetstarted).click();
			 }
			 
			 public void OverviewTrees()
			 {
				 driver.findElement(OverviewofTrees).click();
			 }
			 public void TryHere() 
			 {
				   driver.findElement(TryHere).click();
			 }
			
			 public void writeUp() 
		     {
				 driver.findElement(write).sendKeys("print 'Hello Trees'");
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		     }		  
			 public void run()
		     {
			   driver.findElement(clickrun).click();
		     }
			 public void Terminologies()
			 {
				 driver.findElement(Terminologies).click();
			 }
			 public void TypesOfTrees()
			 {
				 driver.findElement(TypesOfTrees).click();
			 }
			 public void TreeTraversals()
			 {
				 driver.findElement(TreeTraversals).click();
			 }
			 
			 public void TraversalsIllustration()
			 {
				 driver.findElement(TraversalsIllustration).click();
			 }
		    public void BinaryTrees()
		    {
			   driver.findElement(BinaryTrees).click();
		    }
		    public void TypesofBinaryTrees()
		    {
			   driver.findElement(TypesofBinaryTrees).click();
		    }
		    public void ImplementationinPython()
		    {
			   driver.findElement(ImplementationinPython).click();
		    }
		    public void BinaryTreeTraversals()
		    {
			   driver.findElement(BinaryTreeTraversals).click();
		    }
		    public void ImplementationofBinaryTrees ()
		    {
			   driver.findElement(ImplementationofBinaryTrees).click();
		    }
		    public void ApplicationsofBinarytrees()
		    {
			   driver.findElement(ApplicationsofBinarytrees).click();
		    }

		    public void BinarySearchTrees()
		    {
			   driver.findElement(BinarySearchTrees).click();
		    }
		    public void ImplementationOfBST()
		    {
			   driver.findElement(ImplementationOfBST).click();
		    }
		    public void PracticeQuestions ()
		    {
			   driver.findElement(PracticeQuestions).click();
		    }
}

