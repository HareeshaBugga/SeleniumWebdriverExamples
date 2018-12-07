package seleniumWebdriverWait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitExample {
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "enter the path of your chrome driver");
		driver = new ChromeDriver();
		
		driver.get("http://www.qaautomated.com/");
		driver.manage().window().maximize();  //to maximize
		
		WebElement aboutme = driver.findElement(By.xpath("//*[@id=\"site-navigationpbt\"]/div/ul/li[2]/a"));
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(100))
		        .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
		
		aboutme = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id=\"site-navigationpbt\"]/div/ul/li[2]/a"));
		}
	});
		
		aboutme = driver.findElement(By.xpath("//*[@id=\"site-navigationpbt\"]/div/ul/li[2]/a"));
		System.out.println(aboutme.isDisplayed());
		aboutme.click();
		driver.quit();
	}

}
