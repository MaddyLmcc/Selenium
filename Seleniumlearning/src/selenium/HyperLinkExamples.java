package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;import java.security.spec.XECPublicKeySpec;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkExamples {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\L E N O V O\\\\Downloads\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		
		WebElement input = driver.findElement(By.name("q"));
		input.sendKeys("Facebook"+Keys.ENTER);
		
	
		
		WebElement Signup = driver.findElement(By.linkText("Log In"));
		Signup.click();
		driver.navigate().back();
		
		// Find me where i am go to without clicking Link
		
		WebElement WhereToGo = driver.findElement(By.linkText("Facebook, profile picture"));
		String where = WhereToGo.getAttribute("href");
		System.out.println("This Link is going to" + where);
		
		//Link is broken or not
		
		WebElement Linkbroken = driver.findElement(By.linkText("Help Center"));
		Linkbroken.click();
		String Title = driver.getTitle();
		if (Title.contains("404")) {
			System.out.println("The Link is broken");
			
		}
 		else {
			System.out.println("The Link is not broken");
		}
		driver.navigate().back();
		
		//How Many Links in the page
		
		List<WebElement> totalLink = driver.findElements(By.tagName("a"));
		int linkcount = totalLink.size();
		System.out.println("Total Link "+ linkcount);
	}
         
}
