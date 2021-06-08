package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDownWhitOptions {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgr7309\\Documents\\Selenium\\Udemy\\BrowserDriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);

        //int i = 1;
        /**while(i<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }*/
        for (int i=1; i<5; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }


        driver.findElement(By.id("divpaxOptions")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}
