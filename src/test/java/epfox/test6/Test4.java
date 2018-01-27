package epfox.test6;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
public class Test4 {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "WOBQBUUK99999999");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "5.0.2");
        capabilities.setCapability("appPackage", "com.miui.calculator");
        capabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.findElementById("com.miui.calculator:id/btn_1_s").click();
        driver.findElementById("com.miui.calculator:id/btn_plus_s").click();
        driver.findElementById("com.miui.calculator:id/btn_2_s").click();
        driver.findElementById("com.miui.calculator:id/btn_equal_s").click();
        

        driver.quit();
    }

}