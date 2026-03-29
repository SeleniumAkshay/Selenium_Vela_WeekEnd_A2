package KeyBoard;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyPress {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com");

		Robot robot = new Robot();
//		Runtime.getRuntime().exec("notepad");
		Thread.sleep(3000);

		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_B);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_SHIFT);

		Thread.sleep(3000);
		driver.quit();

	}

}
