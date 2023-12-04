package WebElementPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web3_facebbok 
{
public static void main(String[] args) throws InterruptedException {
WebDriver d=new ChromeDriver();
d.get("https://www.facebook.com/");
Thread.sleep(2000);
WebElement s1 = d.findElement(By.xpath("//input[@type='text']"));
s1.sendKeys("Ajay");
s1.clear();
s1.sendKeys("Jyoti");

}
}
