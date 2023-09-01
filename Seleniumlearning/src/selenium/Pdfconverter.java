package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pdfconverter {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\L E N O V O\\\\Downloads\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ilovepdf.com/");
		
		WebElement wordTOpdf = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[7]/a"));
		wordTOpdf.click();
		
		//Select word file
		
		WebElement select = driver.findElement(By.id("pickfiles"));
		select.click();
		
		//Uppload file
		String File = "D:\\Madhan";
		StringSelection selection = new StringSelection(File);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
		Thread.sleep(3000);
		//convert pdf
	    WebElement Convert = driver.findElement(By.xpath("//button[@id='processTask'][@class='btn btn--process btn--red officepdf']"));
		Convert.click();
		
	}

}
