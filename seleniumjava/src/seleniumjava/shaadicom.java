package seleniumjava;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class shaadicom {
WebDriver driver; 
  @Test
  public void regshaadi() throws Exception {
driver.findElement(By.xpath("//label[text()=\"I'm looking for a\"]//following-sibling::div//div[contains(@class,'is-selected')]"
)).click();
driver.findElement(By.xpath("//label[text()=\"I'm looking for a\"]/following-sibling::div//div//div[@aria-selected='false']")).click();
driver.findElement(By.xpath("//label[text()='aged']")).click();
driver.findElement(By.xpath("//div[contains(text(),'25')] and div[contains(@class,'Dropdown-option')]")).click();

	  
  }
  @BeforeTest
  public void beforeTest() {
driver=new ChromeDriver();
driver.get("https://www.shaadi.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }

  @AfterTest
  public void afterTest() {
  }

}
