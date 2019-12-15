package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class SeleniumDriver {

    private static String getChromeDriverPath() {
        return Paths.get(
                System.getProperty("user.dir"),
                "webDrivers",
                "chromedriver.exe"
        ).toString();
    }

    public static WebDriver startChromeDriver(){
        System.setProperty("webdriver.chrome.driver", getChromeDriverPath());

        ChromeOptions options = new ChromeOptions();
        options.addArguments(Arrays.asList("--start-maximized"));

        return new ChromeDriver(options);
    }

    public static void setImplicitWait(WebDriver driver, long milliSecondsTimeout){
        driver.manage().timeouts().implicitlyWait(
                milliSecondsTimeout,
                TimeUnit.MILLISECONDS
        );
    }

    public static void waitFor(long milliSecondsTimeout){
        try {
            Thread.sleep(milliSecondsTimeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
