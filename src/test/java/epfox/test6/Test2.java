package epfox.test6;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Test2 {
    
    private AppiumDriver  driver;
    
    
  @BeforeClass
  public void setup() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.BROWSER_NAME, ""); 
        cap.setCapability("platformName", "Android"); //指定测试平台
        cap.setCapability("deviceName", "WOBQBUUK99999999"); //指定测试机的ID,通过adb命令`adb devices`获取
        cap.setCapability("platformVersion", "5.0.2"); 

        //将上面获取到的包名和Activity名设置为值
        cap.setCapability("appPackage", "com.miui.calculator");
        cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

        //A new session could not be created的解决方法
        cap.setCapability("appWaitActivity","com.miui.calculator.cal.CalculatorActivity");
        //每次启动时覆盖session，否则第二次后运行会报错不能新建session
        cap.setCapability("sessionOverride", true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
  }

  @Test 
  public void plus(){
      
      //获取1
      driver.findElementById("com.miui.calculator:id/btn_1_s").click();
     // driver.findElement(By.id("com.miui.calculator:id/btn_1_s").click();
      //获取+
      driver.findElementById("com.miui.calculator:id/btn_plus_s").click();
      //获取2
      driver.findElementById("com.miui.calculator:id/btn_2_s").click();
      //获取=
      driver.findElementById("com.miui.calculator:id/btn_equal_s").click();
     

  }
  
  @AfterClass
  public void tearDown() throws Exception {
      
      driver.quit();
      
  }
}
