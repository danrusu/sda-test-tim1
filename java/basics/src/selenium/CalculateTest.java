package selenium;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class CalculateTest {

    public static void test(
            int number1,
            int number2,
            int operation,
            String expectedResult) {

        //System.out.println("Start the Selenium Chrome driver");
        WebDriver driver = SeleniumDriver.startChromeDriver();
        SeleniumDriver.setImplicitWait(driver, 5000);

        CalculatePom calculatePage = new CalculatePom(driver);

        driver.navigate().to("http://www.danrusu.ro/calculate/app.html");
        String currentUrl = driver.getCurrentUrl();
        //System.out.println("Url: " + currentUrl);

        calculatePage.setNumber1(number1);
        calculatePage.setNumber2(number2);

        CalculateUtils.setOperation(driver, operation);

        // click the CALCULATE button
        calculatePage.calculate();


        String result = calculatePage.getResult();
        //System.out.println("Result: " + result);

        System.out.print("Test "
                + number1 + ", "
                + number2 + ", "
                + operation + ", "
                + expectedResult + ": ");
        if(result.equals(expectedResult)){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
            System.out.println("Expected: " + expectedResult);
            System.out.println("Actual: " + result);
        }


        //System.out.println("Close driver");
        driver.quit();
    }

    public static void main(String[] args) {
        /*TestData testData1 = new TestData(100, 50, 1, "150");
        TestData testData2 = new TestData(100, 150, 1, "Number1 or Number2 is not in specified range: [-100, 100]");
        TestData testData3 = new TestData(100, 0, 3, "Cannot divide by ");

        List<TestData> testDataList = Arrays.asList(
                testData1,
                testData2,
                testData3
        );

        for (int i = 0; i < testDataList.size(); i++) {
            TestData currentTestData = testDataList.get(i);
            test(currentTestData.number1,
                    currentTestData.number2,
                    currentTestData.operation,
                    currentTestData.expectedResult);
        }*/

        test(100, 50, 1, "150");
        test(100, 150, 1, "Number1 or Number2 is not in specified range: [-100, 100]");
        //test(100, , 1, "One number input is empty");  // cannot tyest due to wrong data type for empty value
        test(100, 0, 3, "Cannot divide by 0");
    }
}
