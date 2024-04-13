package seleniumjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class msaccount   {
WebDriver driver;




	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub	
	msaccount m1=new msaccount();
	//m1.createaccount();
	m1.signin();


	}
public void createaccount() throws Exception {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://account.microsoft.com/account/manage-my-account");
driver.findElement(By.xpath("//span[text()='Sign in']")).click();
driver.findElement(By.xpath("//a[@id='signup']")).click();
driver.findElement(By.xpath("//input[@name='MemberName']")).sendKeys("saitejasai92@outlook.com");
driver.findElement(By.xpath("//input[@value='Next']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='checkbox']")).click();
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Saitejapatel@23");
driver.findElement(By.xpath("//input[@id='iSignupAction']")).click();
driver.findElement(By.name("Country")).sendKeys("India");
driver.findElement(By.xpath("//*[@id=\"BirthMonth\"]")).sendKeys("July");
driver.findElement(By.xpath("//*[@id=\"BirthDay\"]")).sendKeys("30");
driver.findElement(By.xpath("//*[@id=\"BirthYear\"]")).sendKeys("2000");
driver.findElement(By.xpath("//input[@id=\"iSignupAction\"]")).click();


}

public void signin() throws Exception {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://account.microsoft.com/account/manage-my-account");
driver.findElement(By.xpath("//span[text()='Sign in']")).click();
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("saitejasai92@outlook.com");
driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Saitejapatel@23");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(10000);
driver.findElement(By.xpath("//input[@name='DontShowAgain']")).click();
driver.findElement(By.xpath("//button[@id='acceptButton']")).click();




	
}
}