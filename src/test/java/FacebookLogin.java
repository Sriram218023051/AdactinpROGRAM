import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("Sriram");
		WebElement pw = driver.findElement(By.id("pass"));
		pw.sendKeys("Sriram28");
		driver.quit();
		
	}

}
