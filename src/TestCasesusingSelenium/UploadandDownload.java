package TestCasesusingSelenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;

public class UploadandDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System Property for firefox Driver   
		System.setProperty("webdriver.gecko.driver", "/home/raramuri/eclipse-workspace/SeleniumProject/lib/geckodriver/geckodriver");
	  System.setProperty("webdriver.firefox.bin", "/home/raramuri/Downloads/firefox-121.0/firefox/firefox-bin");
	       
	  // Instantiate a Firefox class.     
	  WebDriver dr=new FirefoxDriver();  
	  dr.manage().window().maximize();
	  
	  //open the website 
	  dr.get("https://demoqa.com/elements");
	  dr.findElement(By.id("item-7")).click();
	  
	   // download file
	  dr.findElement(By.id("downloadButton")).click();
	  
	   	try
	   	{
	   		Thread.sleep(3000);
	   	} catch (InterruptedException e) {}
		
	   	//upload file 
	     WebElement fileInput = dr.findElement(By.cssSelector("#uploadFile"));
	    fileInput.sendKeys("/home/raramuri/Downloads/sampleFile.jpeg");
	    
	   	try
	   	{
	   		Thread.sleep(3000);
	   	} catch (InterruptedException e) {}
	   	
	   	dr.quit();
	}

}
