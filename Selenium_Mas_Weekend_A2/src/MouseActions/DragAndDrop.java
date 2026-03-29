package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");

		Actions act = new Actions(driver);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));

//		act.dragAndDrop(src, dest).perform();
		act.clickAndHold(src).pause(400).release(dest).perform();

		driver.get(
				"https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");
//		Thread.sleep(3000);
//		WebElement fEle = driver.findElement(By.xpath("(//div[@class='G12X4V'])[1]"));
//		act.dragAndDropBy(fEle, 50, 0).perform();

		Thread.sleep(3000);
		WebElement fEle1 = driver.findElement(By.xpath("(//div[@class='G12X4V'])[2]"));
		act.dragAndDropBy(fEle1, -50, 0).perform();

		Thread.sleep(3000);
		driver.quit();

	}

}
