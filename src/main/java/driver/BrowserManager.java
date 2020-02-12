package driver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class BrowserManager {

    public static void navigateTo(String url) {
        Driver.getDriver().get(url);
    }

    public static void setImplicitlyWait() {
        Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void nextPage() {
        ArrayList<String> tabs = new ArrayList<String> (Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tabs.get(1));
    }

    public static void backPage() {
        ArrayList<String> tabs = new ArrayList<String> (Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tabs.get(0));

    }
}
