package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageSS {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/webPage.png");
		FileHandler.copy(temp, dest);

		WebElement ele = driver.findElement(By.xpath("//span[text()='Create new account']"));

		File temp1 = ele.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./screenshots/webElement.png");
		FileHandler.copy(temp1, dest1);

		Thread.sleep(3000);
		driver.quit();

	}

}
