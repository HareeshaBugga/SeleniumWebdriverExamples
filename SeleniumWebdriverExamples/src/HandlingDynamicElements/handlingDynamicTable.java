package HandlingDynamicElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class handlingDynamicTable {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "enter chrome path");
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://freecrm.com");
			driver.manage().window().maximize(); 
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElement(By.name("username")).sendKeys("enter username");
			driver.findElement(By.name("password")).sendKeys("enter password");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(3000);
			
			driver.switchTo().frame("mainpanel"); // switch to frame using name.
		//	driver.switchTo().frame(1); switch to frame using index/value
			driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	
			String before_xpath = "//*[@id=\"vContactsForm\"]/table/tbody/tr["; //*[@id="vContactsForm"]/table/tbody/tr[4]/td[1]/input
			String after_xpath = "]/td[2]/a";
			
			for (int i=4; i<=7;i++) {
				String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
				System.out.println(name);
				if(name.contains("adam liam")) {
					driver.findElement(By.xpath("//*[@id=\"vContactsForm\"]/table/tbody/tr[" + i + "]/td[1]/input")).click();
				}
				driver.quit();
			
			}
			
	
	}

	
	
	

}
