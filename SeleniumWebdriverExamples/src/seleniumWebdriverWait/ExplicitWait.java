package seleniumWebdriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "give the path of chrome in your desktop" );
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaautomated.com/");
		driver.manage().window().maximize();  //to maximize
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement aboutme;
		aboutme =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"site-navigationpbt\"]/div/ul/li[2]/a")));
		aboutme.click();
		driver.quit();
			
	}

}
