package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\L E N O V O\\\\Downloads\\\\chromedriver-win32\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		String Oldwindow = driver.getWindowHandle();
		WebElement Login = driver.findElement(By.xpath("//*[text()=' LOGIN ']"));
		Login.click();
		
		Set<String> handles = driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
			Thread.sleep(3000);
			WebElement Username = driver.findElement(By.xpath("//*[@id=\"square-rda-vanilla\"]/div/div"));
			Username.sendKeys("Madhan");
			
		}
		
	

	}

}
