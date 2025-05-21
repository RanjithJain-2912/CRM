package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Differences {
	static {
System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
	}
	@Test
public void demo() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//	WebDriverWait wait=new WebDriverWait(driver, 10);
//	Actions a=new Actions(driver);
//	a.scrollByAmount(0, 0).perform();
//	WebElement e=driver.findElement(By.id(""));
//	e.getShadowRoot();
//	driver.manage().window().minimize();
	driver.quit();
}
}
