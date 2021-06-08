package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class scope {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgr7309\\Documents\\Selenium\\Udemy\\BrowserDriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1.-give me the count of links on the page.
        driver.get("http://qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        WebElement coloumDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

        System.out.println(coloumDriver.findElements(By.tagName("a")).size());


        for(int i =1; i<coloumDriver.findElements(By.tagName("a")).size(); i++ ) {

            String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);

            coloumDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
            Thread.sleep(3000);
        }

            Set<String> abc= driver.getWindowHandles();
            Iterator<String> it= abc.iterator();
            while (it.hasNext()){

                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());
            }

    }
}
