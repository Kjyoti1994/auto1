package WebElementPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web5_getattribute_method
{
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	
	// for facebook page
	//d.get("https://www.facebook.com/");
	//d.findElement(By.xpath("//input[@type='text']")).sendKeys("Ajay");
	//String s = d.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
	//System.out.println(s);
	
	// for snapchat page
	d.get("https://accounts.snapchat.com/accounts/v2/login");
	d.findElement(By.xpath("//input[@name='accountIdentifier']")).sendKeys("Ajay");
	String s = d.findElement(By.xpath("//input[@name='accountIdentifier']")).getAttribute("value");
	System.out.println(s);
}
}