package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		Thread.sleep(500);
		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		Thread.sleep(500);
		driver.navigate().refresh();

		Thread.sleep(3000);
		driver.quit();

	}

}
