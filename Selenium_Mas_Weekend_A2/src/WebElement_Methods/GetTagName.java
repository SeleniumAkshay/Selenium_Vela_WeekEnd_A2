package WebElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(1000);
		String tag = driver.findElement(By.partialLinkText("Register")).getTagName();
		System.out.println(tag);

		String css = driver.findElement(By.partialLinkText("Log in")).getCssValue("font");
		System.out.println(css);

		Dimension size = driver.findElement(By.id("small-searchterms")).getSize();
		System.out.println(size);
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());

		Point loc = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
		System.out.println(loc);
		System.out.println(loc.getX());
		System.out.println(loc.getY());

		Rectangle rect = driver.findElement(By.partialLinkText("COMP")).getRect();
		System.out.println(rect);

		Thread.sleep(3000);
		driver.quit();

	}

}
