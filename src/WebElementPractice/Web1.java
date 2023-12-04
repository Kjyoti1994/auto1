package WebElementPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web1
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver d=new ChromeDriver();
	d.get("https://accounts.snapchat.com/accounts/v2/login");
	d.get("https://www.rapido.bike/");
	Thread.sleep(2000);
	d.navigate().forward();
	d.navigate().back();
	Thread.sleep(2000);
	System.out.println(d.getTitle());
	System.out.println(d.getCurrentUrl());
	d.manage().window().maximize();
	d.quit();
	
	
}
}
