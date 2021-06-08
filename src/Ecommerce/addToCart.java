package Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class addToCart {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgr7309\\Documents\\Selenium\\Udemy\\BrowserDriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait w = new WebDriverWait(driver,5);

        String[] itemsNeeded={"Cucumber","Brocolli", "Beetroot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
        addItemms(driver,itemsNeeded);

        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();


        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());




    }

    public static void addItemms(WebDriver driver, String[] itemsNeeded){

        int j=0;

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i=0; i<products.size(); i++){

            //format de name of vagetable
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
            List itemsNeededlist = Arrays.asList(itemsNeeded);


            if (itemsNeededlist.contains(formattedName)){

                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (j==itemsNeeded.length){
                    break;
                }
            }
        }

    }
}
