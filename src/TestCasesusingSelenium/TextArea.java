package TestCasesusingSelenium;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.*;  
import org.openqa.selenium.firefox.*;

public class TextArea {
	
	// Program to pass values to the text area and click submit button to view the details
public static void main(String[]args)
{
	
	//System Property for firefox Driver   
	System.setProperty("webdriver.gecko.driver", "/home/raramuri/eclipse-workspace/SeleniumProject/lib/geckodriver/geckodriver");
    System.setProperty("webdriver.firefox.bin", "/home/raramuri/Downloads/firefox-121.0/firefox/firefox-bin");
         
    // Instantiate a Firefox class.     
    WebDriver dr=new FirefoxDriver();  
    dr.manage().window().maximize();
    
    //open the website 
    dr.get("https://demoqa.com/elements");
    
    dr.findElement(By.id("item-0")).click();
    
    //passing values to text area
    dr.findElement(By.id("userName")).sendKeys("Swathy K");
    dr.findElement(By.id("userEmail")).sendKeys("swathyk@zopsmart.com");
    dr.findElement(By.id("currentAddress")).sendKeys("Devaiah Park,Bengaluru-560021");
    dr.findElement(By.id("permanentAddress")).sendKeys("Devaiah Park,Bengaluru-560021");
    
    //click on the submit button
    dr.findElement(By.id("submit")).click();
    
    dr.quit();
   
    }
	
}
