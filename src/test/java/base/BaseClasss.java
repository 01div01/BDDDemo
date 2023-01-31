package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClasss {
    public static WebDriver driver;
    public static void initDriver(){
        driver = new ChromeDriver();
        driver.get("https://app.arcfacilities.com/");
    }
}
