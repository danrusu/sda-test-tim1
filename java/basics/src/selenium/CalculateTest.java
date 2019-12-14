package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculateTest {

    public static void main(String[] args) {

        System.out.println("Start the Selenium Chrome driver");
        WebDriver driver = SeleniumDriver.startChromeDriver();
        SeleniumDriver.setImplicitWait(driver, 5000);

        driver.navigate().to("http://www.danrusu.ro/calculate/app.html");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Url: " + currentUrl);

        //driver.findElement(By.id("nr1")).sendKeys("3");
        WebElement nr1Element = driver.findElement(By.cssSelector("#nr1"));
        nr1Element.sendKeys("111");

        driver.findElement(By.cssSelector("#nr2")).sendKeys("7");

        driver.findElement(By.cssSelector("button")).click();

        String result = driver.findElement(By.cssSelector("*[data-qa-test=\"result\"]")).getText();
        System.out.println("Result: " + result);

        System.out.println("Close driver");
        driver.quit();
    }
}
