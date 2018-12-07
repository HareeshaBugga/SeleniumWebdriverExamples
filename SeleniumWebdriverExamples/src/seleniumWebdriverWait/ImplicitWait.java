package seleniumWebdriverWait;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "give the path of chrome in your desktop" );
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();  //to maximize
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
	}
	

}