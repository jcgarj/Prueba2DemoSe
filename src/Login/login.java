package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgr7309\\Documents\\Selenium\\Udemy\\BrowserDriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com"); //URL in the browser
        //driver.get("https://facebook.com");


        /*
        * locator
        *   ID
        *   ClassName
        *   Name
        *   linkText
        *   Xpaht
        *   CSS
        * */

        /*Locator ID
        *
        * findElement ubica el elemento
        * sendKeys graba el texto
        * */

        driver.findElement(By.cssSelector("input#username.input.r4.wide.mb16.mt8.username")).sendKeys("Graba texto en textBox");
        /*Locator ClassName
         *
         * findElement ubica el elemento
         * sendKeys graba el texto
         * */

        driver.findElement(By.cssSelector("input#password.input.r4.wide.mb16.mt8.password")).sendKeys("1203254x");
        driver.findElement(By.cssSelector("input#Login.button.r4.wide.primary")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
        /*Locator linkText
         *
         * linkText ubica las referencias <a href>
         *
         * */
        //driver.findElement(By.className("button r4 wide primary"));
        //driver.findElement(By.cssSelector("#email")).sendKeys("email");

    }

}
