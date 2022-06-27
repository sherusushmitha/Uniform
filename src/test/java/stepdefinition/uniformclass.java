package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class uniformclass {
	WebDriver driver;


@Given("user is on homepage")
public void user_is_on_homepage() {
	System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");		
	driver=new ChromeDriver();
	driver.get("http://uniformm1.upskills.in/admin");
}

//@When("User enter invalid credentials")
//public void user_enter_invalid_credentials() {
//
//	driver.findElement(By.id("input-username")).sendKeys("admin");
//	driver.findElement(By.id("input-password")).sendKeys("Admin@123");
//}

@When("User enter invalid Username {string} and Password {string}")
public void user_enter_invalid_Username_and_Password(String username, String password) {
	driver.findElement(By.id("input-username")).sendKeys(username);
	driver.findElement(By.id("input-password")).sendKeys(password);
}

@When("User click on submit button")
public void user_click_on_submit_button() throws InterruptedException {
	driver.findElement(By.xpath("//button[@type='submit']")).click();		
    Thread.sleep(2000);
    
}

@Then("Validation message appears")
public void validation_message_appears() {
}

@When("User click on Repots")
public void user_click_on_Repots() throws InterruptedException {
	
	driver.findElement(By.xpath("//body/div[@id='container']/nav[@id='column-left']/ul[@id='menu']/li[@id='reports']/a[1]")).click();
    Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[1]/nav/ul/li[9]/ul/li[4]/a")).click();
    driver.findElement(By.xpath("/html/body/div[1]/nav/ul/li[9]/ul/li[4]/ul/li[1]/a")).click();    

}
@When("User Check the start date,end date,Order status")
public void user_Check_the_start_date_end_date_Order_status() throws InterruptedException {
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	Thread.sleep(1000);	
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	
	  
	WebElement ddown=driver.findElement(By.name("filter_order_status_id"));
	Select select= new Select(ddown);
	select.selectByValue("0");
	Thread.sleep(1000);
	select.selectByVisibleText("Chargeback");
	Thread.sleep(1000);
	select.selectByIndex(5);
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[5]")).click();	
	
	
}

@When("User click on filter button")
public void user_click_on_filter_button() {
	driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
}





}
