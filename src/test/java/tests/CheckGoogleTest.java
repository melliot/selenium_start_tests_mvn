package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckGoogleTest {
    @Test
    public void checkGoogle() throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:9515"), DesiredCapabilities.chrome());
        driver.get("http://google.com");

        driver.close();
    }
}
