//package HTMLUnitdriver;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//
//public class BrowsertestingUsingHtmlUnitdriver {
//
//public static void main(String[] args) {
//		WebDriver driver = new HtmlUnitDriver();
//		
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();  //to maximize
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		System.out.println(driver.getTitle());
//	}
//
//}
