package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.ClassFileLocator;

public class Downloadexample {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\L E N O V O\\\\Downloads\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/download/wjwp5l2t319z49mvsxw6kbfnlp6gmlArzz8mtst3x4kAlwA9jcj5g4z9q3hd9tyrp8h4y0Ah0m2nhslfAdkkAt90snr5zhjb6117jblgh17k7szn6gfl6zdxg5nrmjn3Ay3jx4sjx0mvm94cd2d31bvdcm1kg4s24f8g5xwl3xbppkjcdsj1/56w");
		
		WebElement download = driver.findElement(By.id("pickfiles"));
		download.click();
		
		File fileLocation = new File("D:\\");
		File[] toatalFiles=fileLocation.listFiles();
		for (File file : toatalFiles) {
			if (file.getName().equals("Madhan")) {
				System.out.println("File is downloaded");
				break;
			}
		}

	}

}
