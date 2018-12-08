package handleFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	
	public static void main(String[] args) throws InterruptedException {
		//Open the browser
	    System.setProperty("webdriver.chrome.driver", "enter the path of chrome driver");
		ChromeDriver driver = new ChromeDriver();
						
		// enter the url
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();  //to maximize
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("provide username");
		driver.findElement(By.name("password")).sendKeys("provide password");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel"); // switch to frame using name.
	//	driver.switchTo().frame(1); switch to frame using index/value
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		driver.switchTo().defaultContent(); // change back to default content or default frame.
		driver.quit();

		
	}

}
