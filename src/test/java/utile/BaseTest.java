package utile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {

    public WebDriver driver;
    protected HomePage homePage;

    @BeforeClass  //inainte sa fie rulata o clasa o sa se faca setarile pentru driver din aceasta metoda
    public void setupClass(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); //initializare driver

    }
    @BeforeMethod
    public void goHome(){
        driver.get("http://apptest.go.ro:9999/login");
        homePage = new HomePage(driver);
    }

   /* @AfterClass
    public void tearDown(){
        if(driver != null){ //daca istanta de driver nu este null/creat
          //driver.close(); //se inchide doar frontend
            driver.quit(); //se inchide tot procesul atat frontend cat si backend
        }
        */




    }

