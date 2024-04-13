package seleniumjava;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class mouseactions {
WebDriver driver;
Actions  action ;


  @Test(priority=1)
  public void verifydraggable() {
driver.findElement(By.linkText("Draggable")).click();
driver.switchTo().frame(0);
action.clickAndHold(driver.findElement(By.id("draggable"))).build().perform();
action.moveByOffset(10,30).build().perform();
driver.switchTo().defaultContent();
driver.quit();
  }
  
@Test(priority=2)
public void verifydroppable() {
driver.findElement(By.linkText("Droppable")).click();
driver.switchTo().frame(0);
action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
driver.switchTo().defaultContent();
driver.quit();
}
@Test(priority=3)
public void verifysortable() throws Exception {
driver.findElement(By.linkText("Sortable")).click();
driver.switchTo().frame(0);

action.release().build().perform();
driver.switchTo().defaultContent();

}
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		action = new Actions(driver);
  }

@AfterTest
  public void afterTest() {
  }

}
