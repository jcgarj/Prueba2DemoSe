package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgr7309\\Documents\\Selenium\\Udemy\\BrowserDriver\\chrome\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            /*
            *  //tagName[@attribute = 'value'] - xPath
            *   //tagName[contains(@attribute,'value')] - xPath
            *       //input[contains(@name,'username')] --Example
            *
            *

            driver.findElement(By.xpath("//*[@id='email']")).sendKeys("email_address");
            driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Hello");
            driver.findElement(By.xpath("//*[@id='u_0_h_i7']")).click();
            */

            /*
            *  tagName[@attribute ='value'] - css
            *  tagName#id - css
            *  tagName.className - css
            *  tagName[attribute*='value'] - css
            *   input[name*=username]
            * */
            driver.get("https://es-la.facebook.com/");
            driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Email");
            driver.findElement(By.cssSelector("input#pass.inputtext._55r1._6luy._9npi")).sendKeys("psw");
            driver.findElement(By.cssSelector("[value='1']")).click();



            driver.close();
            driver.quit();
    }
}
