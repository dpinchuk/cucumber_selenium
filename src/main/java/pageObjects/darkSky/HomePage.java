package pageObjects.darkSky;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='searchForm']/input")
    private WebElement searchForm;

    @FindBy(xpath = "//*[@id=\"searchForm\"]/a[2]/img")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id='title']/span[1]/span[2]/span[1]")
    private WebElement tempCurrentValue;

    @FindBy(xpath = "//*[@id='title']/span[1]/span[2]/span[2]/span[2]")
    private WebElement tempLowValue;

    @FindBy(xpath = "//*[@id='title']/span[1]/span[2]/span[2]/span[3]")
    private WebElement tempHighValue;

    public void clearSearchTextField() {
        this.searchForm.clear();
    }

    public void enterAddressOrZipcodeIntoTheSearchField(String data) {
        this.searchForm.sendKeys(data);
    }

    public void clickOnSearchMagnifyingGlass() {
        this.searchButton.click();
    }

    public int getCurrentValueOfTemperature() {
        String str = this.tempCurrentValue.getText().split(" ")[0].substring(0, this.tempCurrentValue.getText().split(" ")[0].length() - 1);
        return Integer.parseInt(str);
    }

    public int getLowValueOfTemperature() {
        String str = this.tempLowValue.getText().split(" ")[1].substring(0, this.tempLowValue.getText().split(" ")[1].length() - 1);
        return Integer.parseInt(str);
    }

    public int getHighValueOfTemperature() {
        String str = this.tempHighValue.getText().split(" ")[1].substring(0, this.tempHighValue.getText().split(" ")[1].length() - 1);
        return Integer.parseInt(str);
    }

}