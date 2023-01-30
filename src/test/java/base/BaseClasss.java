package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClasss {
    public static void initDriver(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
