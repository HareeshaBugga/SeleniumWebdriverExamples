package HandlingDynamicElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingCalander {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "enter chrome driver path");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://freecrm.com");
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("enter user name");
		driver.findElement(By.name("password")).sendKeys("enter password");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		
		String date1 = "5-June-2000";
		String dateArr[] = date1.split("-");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		
		String before_xpath = "//*[@id=\"crmcalendar\"]/table/tbody/tr[2]/td/table/tbody/tr[";
		String after_xpath = "]/td[";
		
		final int totalWeekDays = 7;
		
		boolean flag = false;
		for(int rowNum=2; rowNum<=7; rowNum++) {
			for(int colNum = 1; colNum<=totalWeekDays; colNum++) {
				String dayval = driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).getText();
				if(dayval.equals(day)) {
					driver.findElement(By.xpath(before_xpath+rowNum+after_xpath+colNum+"]")).click();
					flag=true;
					break;
					
				}
			}
			if(flag) {
				break;
			}
			
		}

		driver.close();

	}

}
