package seleniumjava;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.nio.file.spi.FileSystemProvider;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class handlingalerts {
	WebDriver driver;
 WebDriverWait wait; 
Actions action;

 @Test(priority=1)
 public void verifyalerts() {
action.sendKeys(Keys.PAGE_DOWN).build().perform();
driver.findElement(By.xpath("//button[@id='alertButton']")).click();
String text=driver.switchTo().alert().getText();
System.out.println("TEXT1: "+text);
driver.switchTo().alert().accept();

driver.findElement(By.id("timerAlertButton")).click();
wait.until(ExpectedConditions.alertIsPresent());
text=driver.switchTo().alert().getText();
System.out.println("TEXT2 :"+text);
driver.switchTo().alert().accept();
 }
@Test
public void verifyalertdismiss() throws Exception {
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
driver.findElement(By.id("confirmButton")).click();
String text=driver.switchTo().alert().getText();
System.out.println("TEXT3 :"+text);
driver.switchTo().alert().dismiss();

driver.findElement(By.id("promtButton")).click();
wait.until(ExpectedConditions.alertIsPresent());
text=driver.switchTo().alert().getText();
System.out.println("TEXT4:"+text);
driver.switchTo().alert().sendKeys("sreekanth sir");
Thread.sleep(2000);
driver.switchTo().alert().accept();







}
@BeforeTest
	  public void beforeTest() {
		  driver=new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			action=new Actions(driver);
  }

  @AfterTest
  public void afterTest() {
  }

}
