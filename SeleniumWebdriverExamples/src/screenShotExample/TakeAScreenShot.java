package screenShotExample;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeAScreenShot {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver", "give the path of chrome driver");
			ChromeDriver driver = new ChromeDriver();
							
			// enter the url
			driver.get("https://www.google.com");
			driver.manage().window().maximize();  //to maximize
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C:\\Users\\haree\\git\\SeleniumWebdriverExamples\\SeleniumWebdriverExamples\\ScreenShots\\google.png"));
	}

}
