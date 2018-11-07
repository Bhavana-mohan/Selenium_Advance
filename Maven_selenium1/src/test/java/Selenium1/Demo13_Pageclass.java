package Selenium1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Demo13_Pageclass {
	WebDriver driver;
	
	By lnc=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	
	By login=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By submail=By.id("newsletter-email");
	By Subscribe=By.id("newsletter-subscribe-button");
	By logout=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");

	public Demo13_Pageclass(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public  void Clicklink() {
		driver.findElement(lnc).click();
	}
	
	public  void typeusername() {
		driver.findElement(uname).sendKeys("gmail@abc.com");
		
	}
	
	public  void typepassword() {
		driver.findElement(pwd).sendKeys("Abcxyz!");
		}
	public  void clickonlogin() {
		driver.findElement(login).click();
	}
	public  void passemail() {
		driver.findElement(submail).sendKeys("gmail@abc.com");
		
	}
	
	public  void subscribe() {
		driver.findElement(Subscribe).click();
	}
	
	public void logout() {
		driver.findElement(logout).click();
	}
	
	
	
	
	
}