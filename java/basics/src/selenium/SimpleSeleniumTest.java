package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimpleSeleniumTest {

    public static void main(String[] args) {

        System.out.println("Start the Selenium Chrome driver");
        WebDriver driver = SeleniumDriver.startChromeDriver();
        SeleniumDriver.setImplicitWait(driver, 5000);

        //driver.navigate().to("http://www.danrusu.ro");
        driver.get("http://www.danrusu.ro");


        String currentUrl = driver.getCurrentUrl();
        System.out.println("First url: " + currentUrl);

        WebElement link = driver.findElement(By.linkText("Play smart with the backend"));
        link.click();

        SeleniumDriver.waitFor(2000);
        currentUrl = driver.getCurrentUrl();
        System.out.println("Second url: " + currentUrl);

        System.out.println("Close driver");
        driver.quit();
    }
}
