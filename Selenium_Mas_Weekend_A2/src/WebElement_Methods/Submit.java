package WebElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonSubmit?sublist=3");

		Thread.sleep(3000);
		driver.findElement(By.id("sat_a")).click();
		driver.findElement(By.id("btn_abh")).submit();

		driver.get("https://demowebshop.tricentis.com/");
		WebElement ele = driver.findElement(By.id("small-searchterms"));

		ele.sendKeys("Book");
		Thread.sleep(2000);
		ele.clear();

		Thread.sleep(3000);
		driver.quit();

	}

}
