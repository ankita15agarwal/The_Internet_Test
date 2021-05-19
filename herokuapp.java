




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class herokuapp {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver ;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		//test 1 - upload
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(.,'File Upload')]")).click();
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\HP\\anki.jpg");
		Thread.sleep(7000);
		driver.findElement(By.id("file-submit")).click();
		
		//test 3 - New Window
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(.,'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Click Here')]")).click();
		
		
}
}