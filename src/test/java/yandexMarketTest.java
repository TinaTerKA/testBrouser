import driver.Driver;
import driver.BrowserManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import pageAuthorization.AuthorizationPage;
import pageObject.MainPage;

import java.util.concurrent.TimeUnit;

public class yandexMarketTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = Driver.getDriver();
    }

    @Test
    public void yandexSearchTest(){
        BrowserManager.navigateTo("https://market.yandex.by");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MainPage mainPage = new MainPage(driver);
        mainPage.login();

        BrowserManager.nextPage();

        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.login();
        authorizationPage.password();

        BrowserManager.backPage();

        mainPage.menu();

        //.n-w-tab_type_navigation-menu (35 штук категорий)
        //driver.close();
    }
}
