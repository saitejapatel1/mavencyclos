package seleniumjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cyclospay {
WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	cyclospay f1=new cyclospay();
	//f1.register();
	f1.login1();
	
	
	}

public void register() throws Exception {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demo.cyclos.org/ui/home");
driver.findElement(By.xpath("//a[@id='register-link']")).click();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("saiteja shabothu");
driver.findElement(By.xpath("//input[@id=\"id_2\"]")).sendKeys("saitejapatel");
driver.findElement(By.xpath("//input[contains(@id,'id_3')]")).sendKeys("saitejashabothu@gmail.com");
driver.findElement(By.xpath("//input[contains(@id,'website')]")).sendKeys("www.zudiofasion.com");
driver.findElement(By.xpath("//label[contains(text(),' Male ')]")).click();
driver.findElement(By.xpath("//button[@id='business_type']")).click();
driver.findElement(By.xpath("//a[@id='business_type_clothing']")).click();
driver.findElement(By.xpath("//input[@placeholder='(201) 555-0123']")).sendKeys("6302319360");
driver.findElement(By.xpath("//input[@id='id_5']")).sendKeys("08704053473");
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='Next']")).click();
}

public void login1() throws Exception {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://demo.cyclos.org/ui/home");
driver.findElement(By.xpath("//div[text()=' Login ']")).click();
driver.findElement(By.xpath("//input[contains(@placeholder,'User')]")).sendKeys("saitejapatel");
driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("3456");
driver.findElement(By.xpath("//span[text()='Submit']")).click();
driver.findElement(By.xpath("//div[contains(text(),'Banking') and (@class='menu-text')]")).click();
driver.findElement(By.xpath("//div[contains(text(),'Payment to user')]")).click();
driver.findElement(By.xpath("//div[@id='dropdown-menu-id_5']")).click();
driver.findElement(By.xpath("//a[text()=' Demo ']")).click();
driver.findElement(By.xpath("//input[contains(@type,'tel')]")).sendKeys("1");
driver.findElement(By.xpath("//div[contains(text(),'Pay now')]")).click();
driver.findElement(By.xpath("//a[contains(@class,'select-option undefined level0 selected')]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("testing");
driver.findElement(By.xpath("//span[text()='Next']")).click();
driver.findElement(By.xpath("//span[text()='Confirm']")).click();
Thread.sleep(1000);
String text=driver.findElement(By.xpath("//div[@class='notification-message']/div")).getText();
System.out.println("Text:"+text);
}
}