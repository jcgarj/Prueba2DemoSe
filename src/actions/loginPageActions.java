package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class loginPageActions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgr7309\\Documents\\Selenium\\Udemy\\BrowserDriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

        driver.findElement(By.cssSelector(".blinkingText")).click();

        //Other windows
        Set<String> windows = driver.getWindowHandles(); //[Parent,Child,subchildId]
        Iterator<String>it = windows.iterator();
        String parenId = it.next();
        String chilId = it.next();
        driver.switchTo().window(chilId);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        String emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

        driver.switchTo().window(parenId);

        driver.findElement(By.id("username")).sendKeys(emailId);
    }
}
