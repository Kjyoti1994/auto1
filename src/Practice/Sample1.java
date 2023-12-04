package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1
{
	public static void main(String[] args) {
		
	
WebDriver d=new ChromeDriver();
d.get("https://www.facebook.com/");
d.findElement(By.xpath("//input[@type='text']")).sendKeys("Ajay");
	}
}
