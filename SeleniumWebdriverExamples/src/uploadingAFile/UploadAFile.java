package uploadingAFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAFile {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "enter path of chrome driver");
		driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize(); 
		
		WebElement fileupload = driver.findElement(By.id("fileupload"));
		fileupload.sendKeys("give a filepath from your desktop");
		driver.quit();
		

	}

}
