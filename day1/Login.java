package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 WebElement elseUserName = driver.findElement(By.id("username"));
		 elseUserName.sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepa");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
		 driver.findElement(By.name("sumbitButton")).click();
		 
		 }
	}


