package WebElementPractice;
// snapshot
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web2 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://accounts.snapchat.com/accounts/v2/login");
	Thread.sleep(2000);
	WebElement s = d.findElement(By.xpath("//input[@id='accountIdentifier']"));
	s.sendKeys("Ajay Kush");
	s.clear();
	s.sendKeys("Jyoti");
	// not able to clear and directly print Jyoti
}
}
