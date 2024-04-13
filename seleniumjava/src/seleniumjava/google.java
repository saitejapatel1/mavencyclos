package seleniumjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class google {

public static void main(String[] args) {
google g1=new google();
g1.openurl();

}
	public void openurl() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//div[5]/a")).click();
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("saiteja");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("uchiha");
driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("saitejashabothu@gmail.com");
driver.findElement(By.xpath("//input[contains(@type,'text')  and   (@aria-label='Re-enter email address')]")).sendKeys("saitejashabothu@gmail.com");
driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("itachinaruto");
driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
driver.findElement(By.xpath("//option[text()='16']")).click();
driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
driver.findElement(By.xpath("//option[text()='Jul']")).click();
driver.findElement(By.xpath("//select[@name='birthday_year']")).click();
driver.findElement(By.xpath("//option[text()='2000']")).click();
driver.findElement(By.xpath("//label[text()='Male']")).click();
driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}
public void forgotpas() {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//a[text()='forgotpass']")).click();
driver.findElement(By.id("identify_email")).sendKeys("6302319360");
driver.findElement(By.name("did_submit")).click();
driver.findElement(By.name("reset_action")).click(); 




}
	
	

	
	
		

	}
