package epfox.test6;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class Test3 {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "WOBQBUUK99999999");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "5.0.2");
        capabilities.setCapability("appPackage", "com.miui.notes");
        capabilities.setCapability("appActivity", ".ui.NotesListActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

       driver.findElement(By.id("com.miui.notes:id/menu_add")).click();
    //    driver.findElement(By.name("5")).click();
    //    driver.findElement(By.name("9")).click();
     //   driver.findElement(By.name("delete")).click();
    //    driver.findElement(By.name("+")).click();
    //    driver.findElement(By.name("6")).click();
   //     driver.findElement(By.name("=")).click();	
   //     Thread.sleep(2000);

    //    String result = driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
   //     System.out.println(result);

     //   driver.quit();
    }

}