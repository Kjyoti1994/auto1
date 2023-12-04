package WebElementPractice;
// GETText Method
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web4_get 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://www.rapido.bike/");
	Thread.sleep(2000);
	//String a = d.findElement(By.xpath("//button[@class='btn yellow-btn']")).getText();
	
String a=d.findElement(By.xpath("(//button[@class='btn black_btn'])[2]")).getText();
System.out.println(a);
Thread.sleep(5000);
}
}
