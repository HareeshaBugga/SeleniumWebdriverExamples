package linksInAPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfLinksInpage {

	public static void main(String[] args) {
		
			
			System.setProperty("webdriver.chrome.driver", "enter the path of chrome driver");
	ChromeDriver driver = new ChromeDriver();
					
	// enter the url
	driver.get("https://en.wikipedia.org/wiki/Main_Page");
	driver.manage().window().maximize();  
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	List <WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());

	for(int i=0; i<links.size();i++) {
		String Linktext = links.get(i).getText();
		boolean enable = links.get(i).isEnabled();
		System.out.println(enable);
		System.out.println(Linktext);
		driver.close();
		
	}
	}

}
