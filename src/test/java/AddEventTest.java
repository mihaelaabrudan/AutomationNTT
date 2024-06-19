

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddEventPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utile.BaseTest;

public class AddEventTest extends BaseTest {
    protected HomePage homePage;

    @Test
    public void testSuccessfulAddEvent() {
        HomePage homePage = new HomePage(driver);

        LoginPage loginPage = homePage.clickLogin();
        loginPage.setemail("mihaela.abrudan99@gmail.com");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.submitButton();

        // Click pe data și navighează la RegisterPage
        AddEventPage addeventPage =homePage.clickCalendarDay();


        // Adaugă titlul evenimentului
        addeventPage.seteventTitle("Automation Training");

        // Apasă butonul de creare a evenimentului
        addeventPage.clickCreateEventButton();



    }
}
