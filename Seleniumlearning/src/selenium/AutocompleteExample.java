package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class AutocompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\L E N O V O\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		//Choose textbox xpath
		WebElement input = driver.findElement(By.xpath("//*[@name='q']"));
		input.sendKeys("f");
		
		//Explicit wait
		Thread.sleep(4000);
		//Choose unordered list xpath
		List<WebElement> Optionlist=driver.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul/li"));
		System.out.println(Optionlist.size());
		
		//using foreach loop
		for (WebElement webElement : Optionlist) {
			
			if (webElement.getText().equals("Flipkart")) {
				webElement.click();
				break;
			}

			}
				
			
			
	
		

	}

}
