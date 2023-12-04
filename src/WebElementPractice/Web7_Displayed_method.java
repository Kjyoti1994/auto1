package WebElementPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web7_Displayed_method 
{
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");
	boolean s = d.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	System.out.println(s);
}
}
