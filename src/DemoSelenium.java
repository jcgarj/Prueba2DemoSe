import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgr7309\\Documents\\Selenium\\Udemy\\BrowserDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.getTitle();
    }
}
