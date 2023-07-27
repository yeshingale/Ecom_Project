package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void flipkartTest() throws InterruptedException {
	  
	  WebDriver d=new FirefoxDriver();
	  Reporter.log("open flipkart",true);
	  d.get("https://www.flipkart.com/");
	  Thread.sleep(5000);
	  d.close();
  }
}
