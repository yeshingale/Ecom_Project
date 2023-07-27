package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra {
  @Test
  public void myntraTest() throws InterruptedException {
	  
	  WebDriver d=new FirefoxDriver();
	  Reporter.log("open myntra",true);
	  d.get("https://www.myntra.com/");
	  Thread.sleep(5000);
	  d.close();
  }
}
