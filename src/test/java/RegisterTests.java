

import pages.HomePage;
import pages.RegisterPage;
import utile.BaseTest;
import org.testng.annotations.Test;



public class RegisterTests extends BaseTest {
    protected HomePage homePage;

    @Test
    public void testSuccessfulSignUp() {

        // Creează o instanță a clasei HomePage
        HomePage homePage = new HomePage(driver);
        // Click pe link-ul 'Register' și navighează la RegisterPage
        RegisterPage registerPage = homePage.clickRegister();
        registerPage.setfirstName("Mihaela");
        registerPage.setlastName("Abrudan");
        registerPage.setphoneNumber("0748291083");
        registerPage.setemail("mihaela.abrudan99@gmail.com");
        registerPage.setPassword("SuperSecretPassword!");
        registerPage.setcity("Cluj-Napoca");
        registerPage.checkCustomer();
        registerPage.submitForm();
    }


}
