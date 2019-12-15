package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculateUtils {

    public static void setSum(WebDriver driver) {
        setOperation(driver, 1);
    }

    public static void setMultiplication(WebDriver driver) {
        setOperation(driver, 2);
    }

    public static void setDivision(WebDriver driver) {
        setOperation(driver, 3);
    }

    private static void setOperation(WebDriver driver, int operationValue) {
        WebElement selector = driver.findElement(
                By.cssSelector(".operation-selector"));
        WebElement option = driver.findElement(
                By.cssSelector("option[value=\"" + operationValue + "\"]"));
        selector.click();
        option.click();
    }
}
