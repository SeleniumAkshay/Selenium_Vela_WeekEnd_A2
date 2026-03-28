package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");

		WebElement ele = driver.findElement(By.id("select3"));
		Select sel = new Select(ele);
		sel.selectByIndex(8);
		Thread.sleep(1000);
		sel.selectByValue("India");
		Thread.sleep(1000);
		sel.selectByVisibleText("Poland");

		sel.getWrappedElement().click();
		sel.getWrappedElement().sendKeys("United Kingdom");
		System.out.println(sel.getWrappedElement().getText());

//		sel.deSelectByContainsVisibleText("Poland");

		Thread.sleep(3000);
		driver.quit();

	}

}
