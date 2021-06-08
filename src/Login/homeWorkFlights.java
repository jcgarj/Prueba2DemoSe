package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class homeWorkFlights {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgr7309\\Documents\\Selenium\\Udemy\\BrowserDriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cleartrip.com/flights");

        //driver.findElement(By.xpath("//select[@id='Adults']")).click();
        //driver.findElement(By.cssSelector("option")).getAttribute("value").contains("2");
        Thread.sleep(3000);


        //List<WebElement> adult = driver.findElements(By.xpath("//select[@id='Adults']"));


            driver.findElement(By.cssSelector("select[id='Adults'] option[value='1']")).click();
            Assert.assertTrue(driver.findElement(By.cssSelector("select[id='Adults'] option[value='1']")).isSelected());
            if (driver.findElement(By.cssSelector("select[id='Adults'] option[value='1']")).isSelected()){
                driver.findElement(By.cssSelector("select[id='Childrens'] option[value='8']")).click();
                Assert.assertTrue(driver.findElement(By.cssSelector("select[id='Childrens'] option[value='8']")).isSelected());
            }
            driver.findElement(By.cssSelector("select[id='Adults'] option[value='1']")).click();
            Assert.assertTrue(driver.findElement(By.cssSelector("select[id='Adults'] option[value='1']")).isSelected());
            Thread.sleep(3000);





    }
}
