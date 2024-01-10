package TestCasesusingSelenium;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;

public class CheckBoxandRadio {
	
	// Program to click the checkbox and Radio button using SVG XPath
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
    
    dr.findElement(By.id("item-1")).click();
    //dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // expand the list of directories under home

    dr.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/div/button[1]")).click();  
    //waiting for 5 seconds
    try {
    	Thread.sleep(5000);
    	} catch (InterruptedException e) {
    	e.printStackTrace();
    	}
    //click the checkbox of office directory
   dr.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/ol/li[2]/ol/li[2]/span/label/span[1]")).click();
   // click the second otion in the menu for radio button
   try {
   	Thread.sleep(5000);
   	} catch (InterruptedException e) {
   	e.printStackTrace();
   	}
   dr.findElement(By.id("item-2")).click();

   
   dr.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]")).click();
   System.out.println("Clicked on  Radio Button");
   System.out.println("Selected Yes");
   try {
   	Thread.sleep(3000);
   	} catch (InterruptedException e) {
   	e.printStackTrace();
   	}
   dr.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]")).click();
   System.out.println("Selected Impressive");
 dr.quit();
    }
	
}
