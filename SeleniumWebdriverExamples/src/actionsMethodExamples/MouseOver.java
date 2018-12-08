package actionsMethodExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "give the path of chrome driver");
		ChromeDriver driver = new ChromeDriver();
						
		// enter the url
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-shopall\"]/span[2]"))).build().perform();
		driver.findElement(By.linkText("Baby")).click();
		driver.close();
		
	}

}
