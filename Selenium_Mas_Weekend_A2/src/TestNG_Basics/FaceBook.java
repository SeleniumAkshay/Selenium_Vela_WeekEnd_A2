package TestNG_Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBook {

	@Test
	public void facebook() throws InterruptedException {
		System.out.println("This is Facebook");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("qsp@gmail.com");

		Thread.sleep(3000);
		driver.quit();
	}

}
