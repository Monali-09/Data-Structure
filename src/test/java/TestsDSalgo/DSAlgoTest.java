package TestsDSalgo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import PagesDSalgo.Array_DS;
import PagesDSalgo.Data_StrutureDS;
import PagesDSalgo.DropDown_DS;
import PagesDSalgo.Graph_DS;
import PagesDSalgo.HomePage_DS;
import PagesDSalgo.Tree_DS;

@Test
public class DSAlgoTest
 {    
	  	private static WebDriver driver =null;		
		public static void main (String[]args)
		{
			try
			{
				setup();
				getStarted();

		}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
   
		public static void setup()
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\SElenuimDriver\\chromedriver.exe");
			 driver = new ChromeDriver(); 
			 driver.get("https://dsportalapp.herokuapp.com/");
		}
	// page-getting started
		public static void getStarted()
		{	    
			  HomePage_DS login= new   HomePage_DS(driver);
			  
			  login.GetStart();
			  login.ClickSigningIn();
			  login.Users_name("SDET9");
			  login.password("Sdetsdet@9");
			  login.clickLogin();		  
		}    
		
				
	    //For data structure
		public static void dataStructure()
		{	
			driver.get("https://dsportalapp.herokuapp.com/home");
			
			Data_StrutureDS ds = new Data_StrutureDS(driver);
			ds.DataStructuresGetStart();
			ds.TimeComplexity();
			ds.TryHere();
			ds.writeUp();
			ds.run();
			ds.backbutton();
		}
		
		
	//for arrays	
		public static void arrays()
		{
	    
			  driver.get("https://dsportalapp.herokuapp.com/home");
			
			  Array_DS arr = new  Array_DS(driver);
			  
			  arr.array_Getstarted();
			  arr.ArraysinPython();
			  arr.TryHere();
			  arr.writeUp("print 'Arryas in Python'");
			  arr.run();
			  arr.backbutton();
			  
			  arr.ArraysUsingList();
			  arr.TryHere();
			  arr.writeUp("print 'Arrays using list'");
			  arr.run();
			  arr.backbutton();
			
			  arr.BasicOperationsinLists();
			  arr.TryHere();
			  arr.writeUp("print ' Basic Operations in Lists'");
			  arr.run();
			  arr.backbutton();
			  
			  arr.ApplicationsofArray();	
			  arr.TryHere();
			  arr.writeUp("print 'Applications of Array'");
			  arr.run();
			  
		 }
	
		//************** Trees	***************************
		public static void trees()
		{	    
			  driver.get("https://dsportalapp.herokuapp.com/home");
			
			  Tree_DS tree = new  Tree_DS(driver);
			  
			  tree.TreeStart();
			  tree.OverviewTrees();
			  tree.TryHere();
			  tree.writeUp();
			  tree.run();
			  tree.backbutton();
			  
			  tree.Terminologies();
			  tree.TryHere();
			  tree.writeUp();
			  tree.run();
			  tree.backbutton();
			  
			  tree.TypesOfTrees();
			  tree.TryHere();
			  tree.writeUp();
			  tree.run();
			  tree.backbutton();
			  
			  tree.TreeTraversals();
			  tree.TryHere();
			  tree.writeUp();
			  tree.run();
			  tree.backbutton();
			  
			  tree.TraversalsIllustration();
			  tree.TryHere();
			  tree.writeUp();
			  tree.run();
			  tree.backbutton();
			  
			  tree.BinaryTrees();
			  tree.TryHere();
			  tree.writeUp();
			  tree.run();
			  tree.backbutton();
			  
			  tree.TypesofBinaryTrees();
			  tree.TryHere();
			  tree.writeUp();
			  tree.run();
			  tree.backbutton();
			  
			  tree.ImplementationinPython();
			  tree.TryHere();
			  tree.writeUp();
			  tree.run();
			  tree.backbutton();
			  
			  tree.BinaryTreeTraversals();
			  tree.TryHere();
			  tree.writeUp();
			  tree.run();
			  tree.backbutton();
			  
			  tree.ImplementationofBinaryTrees();
			  tree.TryHere();
			  tree.writeUp();
			  tree.run();
			  tree.backbutton();
			  
			  tree.ApplicationsofBinarytrees();
			  tree.TryHere();
			  tree.writeUp();
			  tree.run();
			  tree.backbutton();
			  
			  tree.BinarySearchTrees();
			  tree.TryHere();
			  tree.writeUp();
			  tree.run();
			  tree.backbutton();
			  
			  tree.ImplementationOfBST();
			  tree.TryHere();
			  tree.writeUp();
			  tree.run();
			  tree.backbutton();
			  
			  tree.PracticeQuestions();
			  tree.TryHere();
			  tree.writeUp();
			  tree.run();
			  tree.backbutton();
			 
		    }
		
	//for graph	  
		public static void graphs()
		      {
	    
			     driver.get("https://dsportalapp.herokuapp.com/home");
			
			      Graph_DS graph1 = new  Graph_DS(driver);   
			  
					 graph1.graph_Getstarted();
					 graph1.graph();
					 graph1.TryHere();
					 graph1.writeUp(" print 'Graph'");
					 graph1.run();
					 graph1.backbutton();
					 
					 graph1.graphRepresentations();
					 graph1.TryHere();
					 graph1.writeUp(" print 'Graph Representations'");
					 graph1.run();
					 graph1.backbutton();
			 
		}	 
		public static void dropdown()
		{
			driver.get("https://dsportalapp.herokuapp.com/home");
						
			DropDown_DS dd =new DropDown_DS(driver);
			
			dd.DataStructures();
			dd.arrays1();
			dd.backbutton();
			dd.DataStructures();
			dd.linkedlist();
			dd.backbutton();
			dd.DataStructures();
			dd.stack();
			dd.backbutton();
			dd.DataStructures();
			dd.queue();
			dd.backbutton();
			dd.DataStructures();
			dd.trees1();
			dd.backbutton();
			dd.DataStructures();
			dd.graph2();
			dd.backbutton();
		}
		
     
    }

//dropdown();
//dataStructure();
//arrays();
//trees(); 
//graphs();


