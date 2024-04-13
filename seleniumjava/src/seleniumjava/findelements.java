package seleniumjava;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class findelements {
WebDriver driver;
WebDriverWait wait;
Actions action;

  @Test(priority=1)
  public void verifytotallinkscount() {
List<WebElement> links =driver.findElements(By.tagName("a"));
int totallinks=links.size();
System.out.println("total links on page:"+totallinks);
  }
  @Test(priority=2)
  public void footerlinks() {
WebElement footersection=driver.findElement(By.xpath("//div[@id='sdFooter']"));	
int footerlinkscount=footersection.findElements(By.tagName("a")).size();
System.out.println("footer section total links:"+footerlinkscount);
  }
  @Test(priority=3)
  public void collinks() throws Exception {
WebElement colsection=driver.findElement(By.xpath("//div[@id='sdFooter']/div[2]/div[1]/div/div[2]"));
List<WebElement> collinkslist=colsection.findElements(By.tagName("a"));
System.out.println("collinks count:"+collinkslist.size());
for (WebElement element : collinkslist) {
	System.out.println(element.getText());
	
}
for (WebElement webElement : collinkslist) {
String text=webElement.getText();
if(text.contains("Contact Us")) {
	 webElement.click();
	 break;
}
}
Thread.sleep(1000);
String url=driver.getCurrentUrl();
String title=driver.getTitle();
System.out.println("URL:"+url);
System.out.println("TITLE:"+title);
if(title.contains("Blog") && url.contains("Blog")){
	System.out.println("test passed");
}else {
	System.out.println("test failed");

	
	
}


}	

  
	  

  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	action=new Actions(driver);
  }

  @AfterTest
  public void afterTest() {
  }

}

