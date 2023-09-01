package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {  
  
    public static void main(String[] args) {  
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\L E N O V O\\Downloads\\chromedriver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://www.google.co.in");
    	
    	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("irctc");
    	
         
    }  
  
} 