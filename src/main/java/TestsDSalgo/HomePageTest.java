package TestsDSalgo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.annotations.DataProviderAnnotation;

import PagesDSalgo.Array_DS;
import PagesDSalgo.Data_StrutureDS;
import PagesDSalgo.DropDown_DS;
import PagesDSalgo.Graph_DS;
import PagesDSalgo.HomePage_DS;
import PagesDSalgo.Tree_DS;

@Test
public class HomePageTest extends DataProviderAnnotation 
 {    
	  	private static WebDriver driver =null;		
//		public static void main (String[]args)
//		{
//			try
//			{
//				setup();
//				getStarted();
//				//dropdown();
//				dataStructure();
//			    arrays();
//			    //trees(); 
//				//graphs();
//		}
//			catch(Exception ex)
//			{
//				ex.printStackTrace();
//			}
//		}
   
		public static void setup() throws InterruptedException
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\SElenuimDriver\\chromedriver.exe");
			 driver = new ChromeDriver(); 
		//	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.get("https://dsportalapp.herokuapp.com/");
			 
			 HomePage_DS login= new   HomePage_DS(driver);
			  
			  login.GetStart();
			  login.ClickSigningIn();
			  login.Users_name("SDET9");
			  login.password("Sdetsdet@9");
			  login.clickLogin();
			  
	
//******************** page-getting started**************************************************
//		
		
				
//*********************************  For data structure**************************************
						
//			Data_StrutureDS ds = new Data_StrutureDS(driver);
//			ds.DataStructuresGetStart();
//			ds.TimeComplexity();
//			ds.TryHere();
//			ds.writeUp();
//			ds.run();
//			ds.backbutton();
				
		
//*****************************for arrays ***************************************************
//	
	    	  	
			  Array_DS arr = new  Array_DS(driver);
			  
			  arr.array_Getstarted();
			  arr.select_arrays();
			  arr.ArraysinPython();
			  arr.TryHere();
			  arr.writeUp("print 'Arryas in Python'");
			  arr.run();
			  arr.backbutton();
			  
			  arr.ArraysinPython();	
			  arr.PracticeQuestions();
				Thread.sleep(2000);
			  arr.Search_thearray();
				Thread.sleep(2000);
//			  arr.Searchthearray();
//			  arr.writeUp("print'praticequestions '");
//			  arr.run();
			
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
			  arr.backbutton();
			
			
//************************ Trees	***********************************************
	    
//			 		
//			  Tree_DS tree = new  Tree_DS(driver);
//			  
//			  tree.TreeStart();
//			  tree.OverviewTrees();
//			  tree.TryHere();
//			  tree.writeUp();
//			  tree.run();
//			  tree.backbutton();
//			  
//			  tree.Terminologies();
//			  tree.TryHere();
//			  tree.writeUp();
//			  tree.run();
//			  tree.backbutton();
//			  
//			  tree.TypesOfTrees();
//			  tree.TryHere();
//			  tree.writeUp();
//			  tree.run();
//			  tree.backbutton();
//			  
//			  tree.TreeTraversals();
//			  tree.TryHere();
//			  tree.writeUp();
//			  tree.run();
//			  tree.backbutton();
//			  
//			  tree.TraversalsIllustration();
//			  tree.TryHere();
//			  tree.writeUp();
//			  tree.run();
//			  tree.backbutton();
//			  
//			  tree.BinaryTrees();
//			  tree.TryHere();
//			  tree.writeUp();
//			  tree.run();
//			  tree.backbutton();
//			  
//			  tree.TypesofBinaryTrees();
//			  tree.TryHere();
//			  tree.writeUp();
//			  tree.run();
//			  tree.backbutton();
//			  
//			  tree.ImplementationinPython();
//			  tree.TryHere();
//			  tree.writeUp();
//			  tree.run();
//			  tree.backbutton();
//			  
//			  tree.BinaryTreeTraversals();
//			  tree.TryHere();
//			  tree.writeUp();
//			  tree.run();
//			  tree.backbutton();
//			  
//			  tree.ImplementationofBinaryTrees();
//			  tree.TryHere();
//			  tree.writeUp();
//			  tree.run();
//			  tree.backbutton();
//			  
//			  tree.ApplicationsofBinarytrees();
//			  tree.TryHere();
//			  tree.writeUp();
//			  tree.run();
//			  tree.backbutton();
//			  
//			  tree.BinarySearchTrees();
//			  tree.TryHere();
//			  tree.writeUp();
//			  tree.run();
//			  tree.backbutton();
//			  
//			  tree.ImplementationOfBST();
//			  tree.TryHere();
//			  tree.writeUp();
//			  tree.run();
//			  tree.backbutton();
//			  
//			  tree.PracticeQuestions();
//			  tree.TryHere();
//			  tree.writeUp();
//			  tree.run();
//			  tree.backbutton();
//			 
//		    	
////******************************for graph	***************************  
	    
//			      Graph_DS graph1 = new  Graph_DS(driver);   
//			  
//					 graph1.graph_Getstarted();
//					 graph1.select_graph();
//					 graph1.graph();
//					 graph1.TryHere();
//					 graph1.writeUp("print 'Graph'");
//					 graph1.run();
//					 graph1.backbutton();
//					 
//					 graph1.graphRepresentations();
//					 graph1.TryHere();
//					 graph1.writeUp("print 'Graph Representations'");
//					 graph1.run();
//					 graph1.backbutton();
			 
//		     
////************************************dropdown **************************		
//
//			DropDown_DS dd =new DropDown_DS(driver);
//			
//			dd.DataStructures();
//			dd.arrays1();
//			dd.backbutton();
//			dd.DataStructures();
//			dd.linkedlist();
//			dd.backbutton();
//			dd.DataStructures();
//			dd.stack();
//			dd.backbutton();
//			dd.DataStructures();
//			dd.queue();
//			dd.backbutton();
//			dd.DataStructures();
//			dd.trees1();
//			dd.backbutton();
//			dd.DataStructures();
//			dd.graph2();
//			dd.backbutton();
//		
		}	
     
    }


