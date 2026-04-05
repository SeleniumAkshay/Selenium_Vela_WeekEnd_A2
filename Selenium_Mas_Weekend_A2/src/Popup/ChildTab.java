package Popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildTab {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");

		String id = driver.getWindowHandle();
		System.out.println(id);
		System.out.println();

		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone" + Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='RG5Slk'])[1]")).click();

		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		ids.remove(id);
		for (String string : ids) {
			System.out.println(string);
			driver.switchTo().window(string);
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Buy now']")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
