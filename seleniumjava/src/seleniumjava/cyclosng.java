package seleniumjava;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class cyclosng {
	WebDriver driver;
	Actions action;

  @Test(enabled=false)
  public void signup() throws Exception {
	  driver.get("https://demo.cyclos.org/ui/home");
	  driver.findElement(By.xpath("//a[@id='register-link']")).click();
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("saiteja shabothu");
	  driver.findElement(By.xpath("//input[@id=\"id_2\"]")).sendKeys("saitejapatel1");
	  driver.findElement(By.xpath("//input[contains(@id,'id_3')]")).sendKeys("saitejapatel2000@gmail.com");
	  driver.findElement(By.xpath("//input[contains(@id,'website')]")).sendKeys("www.zudiofasion.com");
	  driver.findElement(By.xpath("//label[contains(text(),' Male ')]")).click();
	  driver.findElement(By.xpath("//button[@id='business_type']")).click();
	  driver.findElement(By.xpath("//a[@id='business_type_clothing']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='(201) 555-0123']")).sendKeys("9347169508");
	  driver.findElement(By.xpath("//input[@id='id_5']")).sendKeys("08702445050");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[text()='Next']")).click();
  }
  @Test(priority=1)
  public void login() throws Exception  {
	driver.get("https://demo.cyclos.org/ui/home");
	driver.findElement(By.xpath("//div[text()=' Login ']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("saitejapatel1");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("4567");
	driver.findElement(By.xpath("//span[text()='Submit']")).click();
	driver.findElement(By.xpath("//div[text()='Banking']")).click();
	driver.findElement(By.xpath("//div[text()='Payment to user']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Type to search']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys(" Demo ");
	driver.findElement(By.xpath("//a[text()=' Demo ']")).click();
	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("10");
	driver.findElement(By.xpath("//div[text()='Pay now']")).click();
	driver.findElement(By.xpath("//a[text()=' Pay now ']")).click();
	driver.findElement(By.xpath("//textarea[@class='form-control ng-untouched ng-pristine ng-valid']")).sendKeys("testing");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	driver.findElement(By.xpath("//span[text()='Confirm']")).click();
	Thread.sleep(1000);
	String text=driver.findElement(By.xpath("//div[text()='The payment was successfully processed']")).getText();
	System.out.println("Text:"+text);
	
	
  }
  
  @BeforeTest
  public void beforeTest() {
 driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 action=new Actions(driver);
 
	
  }

  @AfterTest
  public void afterTest() {
  }

}
