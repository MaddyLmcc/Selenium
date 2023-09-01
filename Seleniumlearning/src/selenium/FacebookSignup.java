package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\L E N O V O\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9061994%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiA_6yfBhBNEiwAkmXy53yWaSURYqhODcWUx2Q3w8HGQHV8MAZ1tnU7Id5qXvVa6IFdzv3o-hoCON4QAvD_BwE");
		
	    WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
	    firstname.sendKeys("Madhan");
		
	    WebElement surename = driver.findElement(By.xpath("//*[@name='lastname']"));
	    surename.sendKeys("K");
	    
	    WebElement Mobile = driver.findElement(By.xpath("//*[@name='reg_email__']"));
	    Mobile.sendKeys("9159689720");
	    
	    WebElement Password = driver.findElement(By.xpath("//*[@name='reg_passwd__']"));
	    Password.sendKeys("Madhan@10" + Keys.ENTER);
	    
	    //WebElement Age = driver.findElement(By.xpath("//input[@name='birthday_age']"));
	    //Age.sendKeys("21");
	    //Alert alert = driver.switchTo().alert();
	    //alert.accept();
	    
	    WebElement Date = driver.findElement(By.xpath("//*[@id='day']"));
	    Select select = new Select(Date);
	    select.selectByValue("3");
	    
	    WebElement Month = driver.findElement(By.xpath("//*[@id='month']"));
	    Select select1 = new Select(Month);
	    select1.selectByValue("4"); 
	    
	    WebElement Year = driver.findElement(By.xpath("//*[@id='year']"));
	    Select select2 = new Select(Year);
	    select2.selectByVisibleText("2016");
	    
	    WebElement Gender = driver.findElement(By.xpath("//*[text()='Male']"));
	    Gender.click();
	    
	    WebElement Signup = driver.findElement(By.xpath("//button[@name='websubmit']"));
	    Signup.click(); 
	    Thread.sleep(3000);
	    //Alert alert = driver.switchTo().alert();
	   // alert.accept();
	    
	  
	    
	   

	}

}
