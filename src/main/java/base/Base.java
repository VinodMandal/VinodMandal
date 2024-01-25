package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties prop;



    public Base() throws FileNotFoundException {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("src/main/java/config/confi.properties");
            prop.load(ip);

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void init(){



        ChromeOptions option = new ChromeOptions();

        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--headless");
        driver = new ChromeDriver(option);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));

        driver.get(("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));










    }


}
