package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\L E N O V O\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement IRCTCExculsive = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[2]/a/span"));
		IRCTCExculsive.click();
		
		WebElement first = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[2]/ul/li[1]"));
		first.click();
		
		//Open new Window
		
		String oldWindow = driver.getWindowHandle();
		WebElement secondButton = driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[2]/ul/li[1]/ul/li[2]/a/span"));
		secondButton.click();
		
		//Control going to new window
		
		Set<String> hande = driver.getWindowHandles();
		for (String newWindow : hande) {
			driver.switchTo().window(newWindow);
			
		}
		//Close the new Window
		driver.close();
		
		//Control going to again old Window
		
		driver.switchTo().defaultContent();
 		

	}

}
