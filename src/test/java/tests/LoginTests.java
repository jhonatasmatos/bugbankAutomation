package tests;

import br.com.bugbank.pages.HomePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTest {

    HomePage homePage;

    @Severity(SeverityLevel.NORMAL)
    @Test
    @Description("Test Description : Verify the title of Login Page")
    @Story("Title of Login Page")
    public void verifyLoginPage() {

        // Create Login Page object
        homePage = new HomePage(driver);

        // Verify login page text
        homePage.verifyPageTitle();
        takeScreenShot();
    }

}
