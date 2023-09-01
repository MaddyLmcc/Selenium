package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\L E N O V O\\\\Downloads\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		/*WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("nirrmalbalu@gamil.com");
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		Password.sendKeys("56221236");*/
		
		WebElement Newaccount = driver.findElement(By.xpath("//*[text()='Create new account']"));
		Newaccount.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Madhan");
		

	}

}
