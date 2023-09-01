package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\L E N O V O\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		
		WebElement Calender = driver.findElement(By.xpath("//*[@id=\'jDate\']/span/input"));
		//Calender.sendKeys("10/05/2023"+Keys.ENTER);
		Calender.click();
		
		//Click next button
		WebElement NextButton = driver.findElement(By.xpath("//*[@id=\'jDate\']/span/div/div/div[1]/a[2]/span"));
		NextButton.click();
		
		//Click date
		WebElement date = driver.findElement(By.xpath("//*[@id=\'jDate\']/span/div/div/div[2]/table/tbody/tr[1]/td[5]/a"));
		date.click();

	}

}
