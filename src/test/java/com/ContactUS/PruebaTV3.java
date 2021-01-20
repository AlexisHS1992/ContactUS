package com.ContactUS;

//import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PruebaTV3 {

	public WebDriver driver;

	@Before

	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@Test

	public void testContactUS() {

		driver.findElement(By.id("contact-link")).click();
		WebElement SelSubject = driver.findElement(By.name("id_contact"));
		Select selectSubject = new Select(SelSubject);
		selectSubject.selectByValue("2");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String pageHeading = driver.findElement(By.className("page-subheading")).getText();
		System.out.println("Page Heading: " + pageHeading);

		
		driver.findElement(By.id("email")).sendKeys("alexisherrerasalazar293@gmail.com");
		driver.findElement(By.id("id_order")).sendKeys("DAASAMXBK");
		driver.findElement(By.id("message")).sendKeys("I would like to knows how can I buy my product with cash");
		driver.findElement(By.id("submitMessage")).click();

	}

	//@After
	//public void tearDown() {
		
		//driver.quit();
//	}

}
