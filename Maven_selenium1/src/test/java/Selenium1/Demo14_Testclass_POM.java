package Selenium1;

import org.etsi.uri.x01903.v13.impl.GenericTimeStampTypeImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//class level listener
//@Listeners(Selenium.Demo15_Listeners.class)

public class Demo14_Testclass_POM {
  @Test
  public void Demowebshop() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\training_b6b.00.07\\Desktop\\Web drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Demo13_Pageclass pobject= new Demo13_Pageclass(driver);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		pobject.Clicklink();
		pobject.typeusername();
		pobject.typepassword();
		pobject.clickonlogin();
		pobject.passemail();
		pobject.subscribe();
		Thread.sleep(5000);
		pobject.logout();
		System.out.println("title of the page"+driver.getTitle());
		Assert.assertTrue(driver.getTitle().startsWith("Demo"));
	  driver.close();
  }
}
