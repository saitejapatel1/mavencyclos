package seleniumjava;

import org.openqa.selenium.By;

public class flipkart extends Base{

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	flipkart f=new flipkart();
	f.openurl("https://www.flipkart.com/");
	f.driver.findElement(By.xpath("//span[text()='Login']")).click();
	f.driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).click();
	f.driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("6302319360");
	f.driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
	

	}

}
