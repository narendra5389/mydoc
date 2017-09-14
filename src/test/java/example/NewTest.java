package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://flipkart.com");
	  String s = driver.getTitle();
	  System.out.println(s);
	  //driver.findElement(By.xpath("abc")).click();
	  driver.quit();
	  
  }
}
