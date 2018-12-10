package HandlingDynamicElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicSearch {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "give the path of chrome driver");
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com");
			driver.manage().window().maximize();  //to maximize
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			WebElement search = driver.findElement(By.name("q"));
			search.click();
			search.sendKeys("testing");
			
			List<WebElement> list = driver.findElements(By.xpath("//ul[@role= 'listbox']//li/descendant::div[@class='sbl1']"));
			System.out.println(list.size());

			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i).getText());
				if(list.get(i).getText().contains("testing synonym")) {
					list.get(i).click();
					break;
				}
				driver.close();
			}
				
	}
}
