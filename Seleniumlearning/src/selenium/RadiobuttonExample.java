package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\L E N O V O\\\\Downloads\\\\chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9061994%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAh9qdBhAOEiwAvxIok-h_xFjStl7rgfoRrecnzuf7in7zTWoW6tBzmMhGN4gCuEcgQLUGOxoC0PoQAvD_BwE");
		
		WebElement Female = driver.findElement(By.xpath("//*[@id=\'u_0_o_+O\']/span[1]/label"));
		Female.click();
		
		//WebElement Female1 = driver.findElement(By.xpath("//*[@id=\'u_0_o_Be\']/span[1]/label"));
		//WebElement Male = driver.findElement(By.xpath("//*[@id=\'u_0_o_Be\']/span[2]/label"));
		//WebElement Custom = driver.findElement(By.xpath("//*[@id=\'u_0_o_Be\']/span[3]/label"));
		
		//boolean Status1 = Female1.isSelected();
		//boolean Status2 = Male.isSelected();
		//boolean Status3 = Custom.isSelected();
		
		//System.out.println(Status1);
		//System.out.println(Status2);
		//System.out.println(Status3);
		
		
		

	}

}
