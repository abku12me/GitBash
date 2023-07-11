package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	@Given("I want to Launch the browser")
	public void i_want_to_launch_the_browser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}
	@Given("Enter the URL")
	public void enter_the_url() {
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		
	    
	}
	@When("Login page should displayed")
	public void login_page_should_displayed() {
		System.out.println("login page displayed");
	    
	}
	@When("Enter the username and password")
	public void enter_the_username_and_password() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
	    
	}
	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("submitButton")).click();
	   
	}
	@Then("validate if Home page is displayed or not")
	public void validate_if_home_page_is_displayed_or_not() {
		
		String title=" Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
	    String actualtitle=driver.getTitle();
	    Assert.assertTrue(title.contains(actualtitle));
	    Reporter.log("validation pass",true);
		
	}
	
	

}
