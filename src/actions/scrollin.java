package actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class scrollin {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgr7309\\Documents\\Selenium\\Udemy\\BrowserDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");

        List<WebElement> values =  driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum = 0;


        for (int i=0; i<values.size(); i++){
          sum = sum + Integer.parseInt(values.get(i).getText());

        }

        System.out.println(sum);
        int total = Integer.parseInt( driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
        Assert.assertEquals(sum,total);

    }
}
