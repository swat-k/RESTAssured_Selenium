package TestCasesusingSelenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;

public class Webtable {
	
	// Program to add details into a table submit it ,search and delete it
	public static void main(String[] args) 
{
	
	//System Property for firefox Driver   
	System.setProperty("webdriver.gecko.driver", "/home/raramuri/eclipse-workspace/SeleniumProject/lib/geckodriver/geckodriver");
  System.setProperty("webdriver.firefox.bin", "/home/raramuri/Downloads/firefox-121.0/firefox/firefox-bin");
       
  // Instantiate a Firefox class.     
  WebDriver dr=new FirefoxDriver();  
  dr.manage().window().maximize();
  
  //open the website 
  dr.get("https://demoqa.com/elements");
  
  dr.findElement(By.id("item-3")).click();
  // add details
  dr.findElement(By.id("addNewRecordButton")).click();
  dr.findElement(By.id("firstName")).sendKeys("Swathy ");
  dr.findElement(By.id("lastName")).sendKeys("Kumar");
  dr.findElement(By.id("userEmail")).sendKeys("swathy.k@zopsmart.com");
  dr.findElement(By.id("age")).sendKeys("22");
  dr.findElement(By.id("salary")).sendKeys("15000");
  dr.findElement(By.id("department")).sendKeys("Technology");  
  try {
	   	Thread.sleep(3000);
	   	} catch (InterruptedException e) {}
  dr.findElement(By.id("submit")).click();
  
  // to search the person
  dr.findElement(By.id("searchBox")).sendKeys("Swathy");  
  
  try {
	   	Thread.sleep(3000);
	   	} catch (InterruptedException e) {}
  //to delete the user 
//  dr.findElement(By.xpath("//*[@id=\"delete-record-2\"]")).click();
 dr.quit();
}
	
}
