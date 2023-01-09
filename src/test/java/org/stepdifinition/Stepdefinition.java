package org.stepdifinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {
		WebDriver driver;

	@Given("Login into the trello and create board")
	public void login_into_the_trello_and_create_board() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://trello.com/en/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user")).sendKeys("jeromeclinton650@gmail.com");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("MECH4046tester");
		driver.findElement(By.id("login-submit")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("Home page",currentUrl.contains("login"));
		
			
	}

	@When("Create a list and name it as List A and  List B")
	public void create_a_list_and_name_it_as_List_A_and_List_B() {
	  driver.findElement(By.xpath("//div[@class='board-tile mod-add']")).click();
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Login module");
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("name")).sendKeys("List A");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Add a card']")).click();
		 driver.findElement(By.xpath("//div[@class='js-react-root']/following::textarea[@dir='auto'][2]")).sendKeys("Bug found");
	
		driver.findElement(By.xpath("//div[@class='cc-controls u-clearfix']/child::div[1]/input")).click();
	}

	@When("Add a card in list A and using drag and drop in List B")
	public void add_a_card_in_list_A_and_using_drag_and_drop_in_List_B() {
		WebElement list2 = driver.findElement(By.name("name"));
		list2.sendKeys("List B");
		driver.findElements(By.xpath("//input[@type='submit']")).get(1).click();
		Actions a=new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//span[text()='Bug found']"));
		String x = src.getLocation().toString();
		WebElement dse = driver.findElements(By.xpath("//span[text()='Add a card']")).get(1);
		a.dragAndDrop(src, dse).perform();
		String y = driver.findElement(By.xpath("//span[text()='Bug found']")).getLocation().toString();
		System.out.println("List 1 and List 2 position "+x+y);
		boolean equals = x.equals(y);
		Assert.assertFalse(equals);	
	}

	@Then("Logout")
	public void logout() {
		driver.findElement(By.xpath("//div[@class='yRPuNUIoZpQWwj']")).click();
	     driver.findElement(By.xpath("//span[text()='Log out']"));
	     driver.quit();
	}


		
		
		
		
	

	
}
