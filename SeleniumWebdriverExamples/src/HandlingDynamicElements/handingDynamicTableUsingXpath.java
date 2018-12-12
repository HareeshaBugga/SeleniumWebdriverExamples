package HandlingDynamicElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class handingDynamicTableUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "enter chrome path");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://freecrm.com");
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("enter username");
		driver.findElement(By.name("password")).sendKeys("enter password");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel"); // switch to frame using name.
	//	driver.switchTo().frame(1); switch to frame using index/value
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'kaka richaard')]/parent::td//preceding-sibling::td//input[@name ='contact_id']")).click();
		
		driver.quit();
	}
	
}
