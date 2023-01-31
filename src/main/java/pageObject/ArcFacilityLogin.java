package pageObject;

import locators.loginPageLocators;
import org.openqa.selenium.WebDriver;


public class ArcFacilityLogin implements loginPageLocators {
    private WebDriver driver;

    public ArcFacilityLogin(WebDriver driver) {
        this.driver = driver;
    }

    public void performLogin(){
        driver.findElement(userName).sendKeys("test@gmail.com");
        driver.findElement(password).sendKeys("123456789");
        driver.findElement(signInButton).click();
    }
}
