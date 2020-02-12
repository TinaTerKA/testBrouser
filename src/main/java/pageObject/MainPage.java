package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    private WebElement loginBtn = driver.findElement(By.cssSelector(".header2-nav__user a"));
    private WebElement menuBtn =  driver.findElement(By.cssSelector(".n-w-tab__control_js_inited"));

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        loginBtn.click();
    }

    public void menu() {
        menuBtn.click();
    }

}
