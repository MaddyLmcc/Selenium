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

public class UploadingFileexample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\L E N O V O\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		
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
		
		Thread.sleep(10000);
		WebElement convert = driver.findElement(By.xpath("//*[@id='processTaskTextBtn']"));
		convert.click();

	}

}
