package seleniumjava;

import org.openqa.selenium.By;

public class irctc extends Base {
public static void main(String[] args) {
irctc i=new irctc();
i.openurl("https://www.irctc.co.in/nget/train-search");

i.driver.findElement(By.partialLinkText("REGISTER")).click();
i.driver.findElement(By.id("userName")).sendKeys("saitejapatel120");
i.driver.findElement(By.id("usrPwd")).sendKeys("Saitejaindia@1");
i.driver.findElement(By.id("cnfUsrPwd")).sendKeys("Saitejaindia@1");

}
}
