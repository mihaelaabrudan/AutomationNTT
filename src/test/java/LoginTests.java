import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import org.openqa.selenium.By;
import utile.BaseTest;

import static org.testng.Assert.assertTrue;


public class LoginTests extends BaseTest {
    protected HomePage homePage;

    @Test
    public void testSuccessfulLogin() {

        // Creează o instanță a clasei HomePage
        HomePage homePage = new HomePage(driver);
        // Click pe link-ul 'Register' și navighează la RegisterPage
        LoginPage loginPage = homePage.clickLogin();
        loginPage.setemail("mihaela.abrudan99@gmail.com");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.submitButton();

    }


}
