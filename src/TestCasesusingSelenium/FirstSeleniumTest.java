package TestCasesusingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByAll;  
  
public class FirstSeleniumTest {  
  
	//to open google website and search for selenium
    public static void main(String[] args) {  
      
       // System Property for firefox Driver   
    	System.setProperty("webdriver.gecko.driver", "/home/raramuri/eclipse-workspace/SeleniumProject/lib/geckodriver/geckodriver");
        System.setProperty("webdriver.firefox.bin", "/home/raramuri/Downloads/firefox-121.0/firefox/firefox-bin");
             
        // Instantiate a Firefox class.     
        WebDriver driver=new FirefoxDriver();  
        driver.manage().window().maximize();
          
        // Launch Website  
        driver.get("https://www.google.com");  
        
        //get the id of the search box and type selenium
        driver.findElement(By.id("APjFqb")).sendKeys("selenium");
        driver.findElement(By.className("CcAdNb")).click();
        
        //click on search button 
        driver.findElement(By.name("btnK")).click();
        driver.quit();
    }  
  
}  