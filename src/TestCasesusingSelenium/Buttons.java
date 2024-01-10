package TestCasesusingSelenium;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

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
	    
	    //to perform actions
	    Actions act=new Actions(dr1);
	    
	   dr1.findElement(By.id("item-4")).click();
  
	   //get the element and perform double click
	   WebElement a=dr1.findElement(By.id("doubleClickBtn"));
	   act.doubleClick(a).perform();
	   
	   // get the element and perform right click
	   WebElement a1=dr1.findElement(By.id("rightClickBtn"));
	   act.contextClick(a1).perform();
	   try {
		   	Thread.sleep(3000);
		   	} catch (InterruptedException e) {
		   	e.printStackTrace();
		   	}
 dr1.quit();
	}
}
