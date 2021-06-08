package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

    public static void main(String[] args) throws InterruptedException {
        /**
        *      //Static Drop Down
         *
         *
         * * */
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//Above two lines are responsible for invoking the browser
        driver.get("https://www.cleartrip.com/");

        WebElement staticDropdown = driver.findElement(By.id("Adults"));
//dropdown with select tag
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3); // 4 adults

        Thread.sleep(2000);
        staticDropdown = driver.findElement(By.id("Childrens"));
//dropdown with select tag
        dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(2); // 2 childs

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[title='Depart date']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[title='More search options']")).click();

        Thread.sleep(1000);
        driver.findElement(By.name("airline")).sendKeys("Turkish");
        Thread.sleep(1000);
        driver.findElement(By.id("SearchBtn")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());




    }
}
