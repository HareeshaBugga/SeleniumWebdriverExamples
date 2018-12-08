package actionsMethodExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "give the path of chrome driver");
		ChromeDriver driver = new ChromeDriver();
						
		// enter the url
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();
		driver.close();
		
	}

}
