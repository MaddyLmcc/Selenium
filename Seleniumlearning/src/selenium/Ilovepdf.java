package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilovepdf {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\L E N O V O\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[7]/a/h3")).click();
		
		WebElement Upload = driver.findElement(By.id("pickfiles"));
		Upload.click();
		
		//Windows control
		Thread.sleep(5000);
		String File = "D:\\Madhankumar K- Resume";
		//Using Stringselection class
		StringSelection selection = new StringSelection(File);
		
		//Using ToolKit 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		//Using Robot class
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);;
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		// file convert word to pdf
		Thread.sleep(5000);
		driver.switchTo().defaultContent();

	}

}
