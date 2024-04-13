package seleniumjava;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

@Test
public class frames {
	WebDriver driver;
	
  public void handlingframes() {
	 driver.findElement(By.xpath("//a[text()='Draggable']")).click();
	 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	 String text=driver.findElement(By.xpath("//div[@id='draggable']/p")).getText();
	 System.out.println("TEXT:"+text);
	 driver.switchTo().defaultContent();
	 driver.findElement(By.xpath("//a[text()='Draggable']")).click();
	 driver.switchTo().frame(0);
	 text=driver.findElement(By.xpath("//div[@id='draggable']/p")).getText();
	 System.out.println("TEXT:"+text);
	 driver.switchTo().defaultContent();
  }
	 


	


	
	 
  
  @BeforeTest
  public void beforeTest() {
	driver=new ChromeDriver();
	driver.get("https://jqueryui.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
  }

  @AfterTest
  public void afterTest() {
  }

}
