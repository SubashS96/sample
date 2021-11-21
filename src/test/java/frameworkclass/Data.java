package frameworkclass;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Data {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91630\\eclipse-workspace\\frameworkclass\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.wpjobboard.net/wp-login.php?redirect_to=https%3A%2F%2Fdemo.wpjobboard.net%2Fwp-admin%2Fadmin.php%3Fpage%3Dwpjb-job&reauth=1");
		//to locate web element in tables
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
//		driver.findElement(By.xpath("//a[text()='Applications ']")).click();
//		driver.findElement(By.xpath("//a[@title='Edit  \"Dick Barslow\"']//ancestor::tr//child::td[7]//child::span//span[@data-value='5']")).click();
//		driver.findElement(By.xpath("//a[@title='Edit  \"Carl Mason\"']/ancestor::tr/child::td[7]/child::span//span[@data-value='3']")).click();
		
		

		List<WebElement> all = driver.findElements(By.xpath("//a[contains(text(),'Design')]/ancestor::tr/child::td[2]"));
		System.out.println(all.size());
		for (WebElement x : all) {
			System.out.println(x.getText());
		}
	}
}

		
		
	


