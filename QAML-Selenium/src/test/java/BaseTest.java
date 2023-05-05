import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class BaseTest {
    private WebDriver webDriver;//el webdriver tiene que estar encapsulado

    public WebDriver getWebDriver() {
        //File ruta = new File("/Users/mlopez/Downloads/chromedriver_mac_arm64/chromedriver.exe");//para chrome
        //System.setProperty("webdriver.chrome.driver",ruta.getPath());
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--incognito");
        //options.addArguments("--remote-allow-origins=*");
        //webDriver=new ChromeDriver(options);

        File ruta = new File("/Users/mlopez/Downloads/geckodriver");//donde tengo el webdriver
        System.setProperty("webdriver.gecko.driver",ruta.getPath());
        webDriver=new FirefoxDriver();
        return webDriver;
    }
}
