package locators;

import org.openqa.selenium.By;

public interface loginPageLocators {
    By userName = By.xpath("//input[@id='UserID']");
    By password =By.xpath("//input[@id='Password']");
    By signInButton = By.id("btnLogin");
}
