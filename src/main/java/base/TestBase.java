package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;

    public WebDriver webDriverManager() throws IOException {
        prop = new Properties();
        FileInputStream file = new FileInputStream("src/main/java/configProperties/ConfigPro");
        prop.load(file);
        if (driver == null) {
            String browserName = prop.getProperty("browser");
            if (browserName.equalsIgnoreCase("chrome")) {
                driver = WebDriverManager.chromedriver().create();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                driver = WebDriverManager.firefoxdriver().create();
            } else if (browserName.equalsIgnoreCase("edge")) {
                driver = WebDriverManager.edgedriver().create();
            }
            driver.get("https://demo.nopcommerce.com/cart");
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);


        }
        return driver;


    }
}