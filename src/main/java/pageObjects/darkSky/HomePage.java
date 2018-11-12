package pageObjects.darkSky;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "//*[@id='searchForm']/input")
    private WebElement searchForm;

    @FindBy(how = How.CSS, using = "//*[@id='searchForm']/a[2]/img")
    private WebElement searchButton;

    @FindBy(how = How.CSS, using = "//*[@id='title']/span[1]/span[2]/span[1]")
    private WebElement tempCurrentValue;

    @FindBy(how = How.CSS, using = "//*[@id='title']/span[1]/span[2]/span[2]/span[2]")
    private WebElement tempLowValue;

    @FindBy(how = How.CSS, using = "//*[@id='title']/span[1]/span[2]/span[2]/span[3]")
    private WebElement tempHighValue;

}