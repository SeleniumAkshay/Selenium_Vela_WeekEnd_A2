package TestNG_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {

	@Test(invocationCount = 5, threadPoolSize = 5)
	public void test1() throws InterruptedException {
		System.out.println("Test 1");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("Iphone 14" + Keys.ENTER);

		Thread.sleep(300);
		driver.quit();
	}

}
