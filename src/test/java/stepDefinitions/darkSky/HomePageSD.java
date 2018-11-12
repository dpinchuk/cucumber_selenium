package stepDefinitions.darkSky;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.darkSky.HomePage;

public class HomePageSD {

    private WebDriver driver;
    private HomePage home;

    @Given("^Goto$")
    public void user_is_on_Home_Page(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/2.41/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://darksky.net");
    }

}