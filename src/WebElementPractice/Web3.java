package WebElementPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web3
{
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");
	d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(5000);
	
	WebElement s1 = d.findElement(By.xpath("(//input[@type='text'])[2]"));
	s1.sendKeys("Ajay");
	s1.clear();
	s1.sendKeys("Jyoti");	
	
}
}
