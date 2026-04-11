package TestNG_Basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report {

	@Test
	public void reportGeneration() {
		System.out.println("Report is generated");
		Reporter.log("Hello", false);
		Reporter.log("Hi", true);
	}

}
