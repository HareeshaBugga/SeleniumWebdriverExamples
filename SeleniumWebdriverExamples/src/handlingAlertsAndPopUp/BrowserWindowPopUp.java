package handlingAlertsAndPopUp;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUp {

	public static void main(String[] args) {
		
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\haree\\\\Desktop\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.get("http://popuptest.com/goodpopups.html");
	driver.manage().window().maximize(); 
	
	WebElement popup1 = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]"));
	popup1.click();
	System.out.println(popup1.getText());
	
	Set<String> handler = driver.getWindowHandles();
	System.out.println(handler.size());
	
	Iterator<String> it = handler.iterator();
	
	String parentwindow = it.next();
	System.out.println("parent window id:" + parentwindow);
	
	String childwindow = it.next();
	System.out.println("child window id:" + childwindow);
	
	driver.switchTo().window(childwindow);
	driver.close();
	
	driver.switchTo().window(parentwindow);
	System.out.println(driver.getTitle());
	driver.close();
	}

}
