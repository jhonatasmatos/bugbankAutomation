package tests;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    @Step("Start the application")
    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://bugbank.netlify.app/");
    }

    @Step("Stop the application")
    @AfterEach
    public void close() {
        driver.close();
    }

    public void takeScreenShot() {
        Allure.addAttachment("Image", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }
}
