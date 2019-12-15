package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatePom {
    WebDriver driver;

    By number1 = By.cssSelector("#nr1");
    By number2 = By.cssSelector("#nr2");
    By calculateButton = By.cssSelector("button");
    By result = By.cssSelector("*[data-qa-test=\"result\"]");

    public CalculatePom(WebDriver driver) {
        this.driver = driver;
    }

    public void calculate(){
        driver.findElement(calculateButton).click();
    }

    public void setNumber1(int value) {
        driver.findElement(number1).sendKeys("" + value);
    }

    public void setNumber2(int value) {
        driver.findElement(number2).sendKeys("" + value);
    }

    public String getResult(){
        WebElement resultField = driver.findElement(result);
        return resultField.getText();
    }
}
