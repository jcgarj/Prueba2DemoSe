package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class elementsWebPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgr7309\\Documents\\Selenium\\Udemy\\BrowserDriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


        //ui-state-default.
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        //System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        //System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());


        //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.iu-state.active")).click();

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);

        //int i = 1;
        /**while(i<5){
         driver.findElement(By.id("hrefIncAdt")).click();
         i++;
         }*/
        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }


        driver.findElement(By.id("divpaxOptions")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


        // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
       if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
           System.out.println("its enabled");
           Assert.assertTrue(true);
        }else{
           Assert.assertTrue(false);
       }




    }
}
