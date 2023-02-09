package br.com.bugbank.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {
    WebDriver driver;
    By title = By.tagName("h1");
    By inputName = By.name("email");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Verify title of Login Page")
    public void verifyPageTitle() {
        String loginPageTitle = driver.findElement(title).getText();
        assertTrue(loginPageTitle.contains("O banco com bugs e falhas do seu jeito"));
    }
}
