package HandlingDynamicElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class handlingDynamicTable {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\haree\\\\Desktop\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com");
			driver.manage().window().maximize(); 
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}
