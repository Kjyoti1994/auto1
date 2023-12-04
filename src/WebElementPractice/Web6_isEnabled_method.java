package WebElementPractice;
//using facebook
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web6_isEnabled_method 
{
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.get("https://www.facebook.com/");
	boolean s = d.findElement(By.xpath("//button[@value='1']")).isEnabled();
	System.out.println(s);
}
}
