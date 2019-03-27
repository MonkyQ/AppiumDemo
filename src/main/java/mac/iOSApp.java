package mac;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class iOSApp {


    private static IOSDriver<?> mobileDriver;

    @Test
    public void initail() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","iPhone 6P");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "10.3.3");
        capabilities.setCapability("bundleId", "com.suning.SuningEMall");
        capabilities.setCapability("udid", "f9039c91f04ed0d912c1f4f203fdf72e30b81360");
        capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.7.2");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
//        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
//        capabilities.setCapability("startIWDP", true);

        mobileDriver = new IOSDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

    }

    public void doBackGroundAction() {

    }



    public static void main() {

    }

}
