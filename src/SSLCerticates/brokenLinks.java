package SSLCerticates;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class brokenLinks {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgr7309\\Documents\\Selenium\\Udemy\\BrowserDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        //SoftAssert a = new SoftAssert();

        for (WebElement link:links) {
            //broken URL
            String url =  link.getAttribute("href");

            HttpURLConnection conn = (HttpURLConnection ) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int resCod = conn.getResponseCode();
            System.out.println(resCod);
            if (resCod >400){
                System.out.println("The link with text " +link.getText() + " is broken with code "+ resCod);
                Assert.assertTrue(false);
            }
        }
    }
}
