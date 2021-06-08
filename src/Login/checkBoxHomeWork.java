package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class checkBoxHomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgr7309\\Documents\\Selenium\\Udemy\\BrowserDriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Assert.assertFalse(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type='checkbox'"));

        for (WebElement checked: checkBoxes) {
            checked.click();
        }

        Assert.assertTrue(driver.findElement(By.cssSelector("input[type='checkbox'")).isSelected());
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox'")).size());



    }

}
