/*
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculateTestNumbersNotInRange {

    public static void main(String[] args) {
        String expectedResult = "Number1 or Number2 is not in specified range: [-100, 100]";

        System.out.println("Start the Selenium Chrome driver");
        WebDriver driver = SeleniumDriver.startChromeDriver();
        SeleniumDriver.setImplicitWait(driver, 5000);

        CalculatePom calculatePage = new CalculatePom(driver);

        driver.navigate().to("http://www.danrusu.ro/calculate/app.html");
        String currentUrl = driver.getCurrentUrl();
        //System.out.println("Url: " + currentUrl);

        calculatePage.setNumber1(1000);
        calculatePage.setNumber2(50);
        // set operation  (static method)
//        CalculateUtils.setDivision(driver);
//        SeleniumDriver.waitFor(2000);
//        CalculateUtils.setSum(driver);
//        SeleniumDriver.waitFor(2000);
        CalculateUtils.setMultiplication(driver);

        // click the CALCULATE button
        calculatePage.calculate();


        String result = calculatePage.getResult();
        //System.out.println("Result: " + result);

        if(result.equals(expectedResult)){
            System.out.println("Test PASSED");
        }
        else{
            System.out.println("Test FAILED");
            System.out.println("Expected: " + expectedResult);
            System.out.println("Actual: " + result);
        }


        //System.out.println("Close driver");
        driver.quit();
    }

}
*/
