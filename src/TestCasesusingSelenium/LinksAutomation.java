package TestCasesusingSelenium;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;

public class LinksAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System Property for firefox Driver   
		System.setProperty("webdriver.gecko.driver", "/home/raramuri/eclipse-workspace/SeleniumProject/lib/geckodriver/geckodriver");
	    System.setProperty("webdriver.firefox.bin", "/home/raramuri/Downloads/firefox-121.0/firefox/firefox-bin");
	         
	    // Instantiate a Firefox class.     
	    WebDriver dr1=new FirefoxDriver();  
	    dr1.manage().window().maximize();
	    
	    //open the website 
	    dr1.get("https://demoqa.com/elements");
	    

		   // click on the links to navigate to /switch to another window
		   dr1.findElement(By.id("item-5")).click();
		   try {
			   	Thread.sleep(2000);
			   	} catch (InterruptedException e) {
			   	e.printStackTrace();
			   	}
		   
		   //get the parent window/current window handle
		   String parent=dr1.getWindowHandle();
		   
		   dr1.findElement(By.id("simpleLink")).click();
		   dr1.switchTo().window(parent);
		   //dr1.close();
//		   dr1.findElement(By.id("dynamicLink")).click();
//		   dr1.quit();
		   
		   dr1.findElement(By.id("created")).click();

		   WebElement ex= dr1.findElement(By.cssSelector("#linkResponse"));
		   String s=ex.getText();
		   System.out.println(s);
		   dr1.quit();
		}

	}


