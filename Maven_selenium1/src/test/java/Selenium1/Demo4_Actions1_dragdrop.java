package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo4_Actions1_dragdrop {
	WebDriver driver;

	@Test
	public void Actions1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\training_b6b.00.07\\Desktop\\Web drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement	from =driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
	WebElement	to =driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_priceChecker\"]"));
	Actions act1 = new Actions(driver);
	Thread.sleep(5000);
		act1.dragAndDrop(from, to).perform();;
		Thread.sleep(5000);
		String price=driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1")).getText();
		System.out.println("print:"+price);
	}
	
}
