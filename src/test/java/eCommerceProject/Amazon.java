package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void amazonTest() throws InterruptedException {
	  
	  WebDriver d=new FirefoxDriver();
	  Reporter.log("open amazon",true);
	  d.get("https://www.amazon.in/");
	  Thread.sleep(5000);
	  d.close();
  }
}
