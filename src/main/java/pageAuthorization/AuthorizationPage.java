package pageAuthorization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthorizationPage {
    private WebDriver driver;
    private WebElement logIn = driver.findElement(By.id("passp-field-login"));
    private WebElement password = driver.findElement(By.id("passp-field-passwd"));

    public AuthorizationPage(WebDriver driver){
        this.driver = driver;
    }

    public void login() {
        logIn.sendKeys("an.l1n");
    }

    public void password(){
        password.sendKeys("Parolanl1n");
    }



}
