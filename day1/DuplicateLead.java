package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
			
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
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Using Selenium tool");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("deepa.johanna@gmail.com");
				driver.findElement(By.className("smallSubmit")).click();
				driver.findElement(By.linkText("Edit")).click();
				driver.findElement(By.id("updateLeadForm_description")).clear();
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Good");
				driver.findElement(By.name("submitButton")).click();
				String title = driver.getTitle();
				System.out.println("The title of this webpage is " + title);
			
				driver.findElement(By.linkText("Duplicate Lead")).click();
				WebElement Company = driver.findElement(By.id("createLeadForm_companyName"));
				Company.clear();
				Company.sendKeys("Technopark");
				WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
				FirstName.clear();
				FirstName.sendKeys("Johanna");
				driver.findElement(By.name("submitButton")).click();
				String title1 = driver.getTitle();
				System.out.println("The title of this webpage is " + title1);
	}

}
