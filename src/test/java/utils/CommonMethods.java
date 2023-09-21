package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CommonMethods {
    public static WebDriver driver;
    public static void initiateBrowser(){
         driver = new ChromeDriver();

        driver.get("http://localhost:3000/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public static void closeBrowser(){
       driver.quit();
    }
}
