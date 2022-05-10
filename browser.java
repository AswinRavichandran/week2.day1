package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("infy");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aswin");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aswin");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("68,000.00");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("6865");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("hii everyone!");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Welcome everyone");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravichandran");
		driver.close();
	}

}
