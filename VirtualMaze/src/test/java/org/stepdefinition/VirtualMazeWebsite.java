package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class VirtualMazeWebsite {
	
	public static WebDriver driver;
	
	@Given("To launch the chrome browser and maximise window")
	public void to_launch_the_chrome_browser_and_maximise_window() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("To launch the URL of Virtualmaze website")
	public void to_launch_the_URL_of_Virtualmaze_website() {
		driver.get("https://vmmaps.com/vrs/");
	}

	@When("To click on the demo button")
	public void to_click_on_the_demo_button() {
		driver.findElement(By.id("Try-Demo")).click();
	}

	@When("Click on close in the instuction tab")
	public void click_on_close_in_the_instuction_tab() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
	}

	@When("Click on Create New Project")
	public void click_on_Create_New_Project() {
		driver.findElement(By.id("createProject-Container")).click();
	}

	@When("Give the project name")
	public void give_the_project_name() {
		driver.findElement(By.id("projectname")).sendKeys("Food Delivery Project");
	}

	@When("Select the vehicle type")
	public void select_the_vehicle_type() {
		driver.findElement(By.id("vehicle-type-4")).click();
	}

	@When("Type the notes regarding project")
	public void type_the_notes_regarding_project() {
		driver.findElement(By.id("additionalNotes")).sendKeys("Food will be delivered to the customer within time...");
	}

	@When("Click on save button")
	public void click_on_save_button() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.id("(//button[text()='Save'])[1]")).click();
		
	}

}
