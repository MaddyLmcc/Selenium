package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\L E N O V O\\\\Downloads\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		//driver.switchTo().frame("https://cube-node-app-02.nlpcaptcha.in/click.php?id=E_fb00c4060d9853f0&face=475");
		//WebElement image1 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[2]/a/img"));
		//image1.click();
        
		
		List<WebElement> total= driver.findElements(By.tagName("iframe"));
		int size = total.size();
		System.out.println(size);
	}

}
