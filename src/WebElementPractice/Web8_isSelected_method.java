package WebElementPractice;
             // is selected original status bayega 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web8_isSelected_method 
{
	public static void main(String[] args) throws InterruptedException {
	
WebDriver d=new ChromeDriver();
d.get("https://www.facebook.com/");
d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(5000);
WebElement a = d.findElement(By.xpath("(//input[@type='text'])[2]"));
a.sendKeys("Ajay");
a.clear();
a.sendKeys("xyz");
//d.findElement(By.xpath("//label[@class='_58mt']")).click();
boolean b = d.findElement(By.xpath("//label[@class='_58mt']")).isSelected();
System.out.println(b);
d.findElement(By.xpath("//label[@class='_58mt']")).click();
//boolean c = d.findElement(By.xpath("//label[@class='_58mt']")).isSelected();
//System.out.println(c);



}
}
