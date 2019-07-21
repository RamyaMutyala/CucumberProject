package com.discovery.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.discovery.utility.PropertiesReader;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DicoveryStepDefinition extends PropertiesReader{
	
	public static WebDriver driver;
	
	private String url = "URL";
	private String addToFavorites = "AddToFavorites";
	private String menuItems = "Menu";
	private String myVideos = "MyVideos";
	private String videoTitle = "FavVideoTitle";
	private String videoDescription = "FavVideoDescription";
	private String video2Title = "FavVideoTitle2";
	private String video2Description = "FavVideoDescription2";
	
	@Given("^I launch Chrome browser and open url$")
	public void launh_browser_to_enter_url() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getData(url));
	}
	
	@When("^I add video \"([^\"]*)\" to favourites list$")
	public void add_video_to_favourites_list(String videoName) throws Throwable{
		WebElement element = driver.findElement(By.xpath(getData(addToFavorites).replace("{value}", videoName)));
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
		action.moveToElement(element).build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		js.executeScript("arguments[0].click();",element);
	}
	
	@When("^Navigate to my videos$")
	public void navigate_to_my_videos() throws Exception{
		WebElement menu = driver.findElement(By.xpath(getData(menuItems)));
		menu.click();
		WebElement myVideosLink = driver.findElement(By.xpath(getData(myVideos)));
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(myVideosLink));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",myVideosLink);
	}
	
	@Then("^Verify the first video appear with correct title \"([^\"]*)\" and description \"([^\"]*)\"$")
	public void verify_video1_title_description(String expectedTitle, String expectedDescription) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,10);	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(getData(videoTitle))));
		WebElement favVideoTitle = driver.findElement(By.xpath(getData(videoTitle)));	
		String actualTitle = favVideoTitle.getAttribute("innerText");
		Assert.assertEquals(actualTitle, expectedTitle);
		WebElement favVideoDescription = driver.findElement(By.xpath(getData(videoDescription)));
		String actualDescription = favVideoDescription.getAttribute("innerText");
		Assert.assertEquals(actualDescription, expectedDescription);
	}
	
	@Then("^Verify the second video appear with correct title \"([^\"]*)\" and description \"([^\"]*)\"$")
	public void verify_video2_title_description(String expectedTitle, String expectedDescription) throws Exception{
		WebElement favVideoTitle = driver.findElement(By.xpath(getData(video2Title)));
		String actualTitle = favVideoTitle.getAttribute("innerText");
		Assert.assertEquals(actualTitle, expectedTitle);
		WebElement favVideoDescription = driver.findElement(By.xpath(getData(video2Description)));
		String actualDescription = favVideoDescription.getAttribute("innerText");
		Assert.assertEquals(actualDescription, expectedDescription);
	}
	
	@After
	public void quitDriver() {
		driver.quit();
	}
}
