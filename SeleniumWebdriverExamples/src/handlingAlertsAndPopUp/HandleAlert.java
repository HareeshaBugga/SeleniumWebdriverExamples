package handlingAlertsAndPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "enter path of chrome driver");
		driver = new ChromeDriver();
		
		driver.get("https://online.keralartc.com/oprs-web/");
		driver.manage().window().maximize();  
		
		WebElement submit = driver.findElement(By.id("searchBtn"));
		submit.click();
		Thread.sleep(3000);
		String message = driver.switchTo().alert().getText();
		System.out.println(message);
		if(message.equals("please enter a valid user name")) {
			System.out.println("correct message - proceed");
		}
		else {
			System.out.println("Incorrect message dismiss");
		}
		driver.switchTo().alert().accept(); //accept the alert 
//		driver.switchTo().alert().dismiss(); //dismiss the alert
		driver.close();
		
		
		
	}

}
