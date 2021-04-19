import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class firefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\jgr7309\\Documents\\Selenium\\Udemy\\BrowserDriver\\firefox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://google.com");
        System.out.println(driver.getTitle());
    }
}
