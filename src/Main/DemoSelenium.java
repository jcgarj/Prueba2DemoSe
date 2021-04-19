import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgr7309\\Documents\\Selenium\\Udemy\\BrowserDriver\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle()); //obtiene el titulo de la pagina
        System.out.println(driver.getCurrentUrl());// valida si la URL es correcta

        //System.out.println(driver.getPageSource());// contiene el html de la pagina

        driver.get("http://amazon.com"); // Se posiciona en amazon


        //driver.navigate().back(); // regresa a google
        //driver.navigate().forward();

        driver.close(); //cierra la sesion del navegador
        driver.quit(); //cierra el navegador

    }
}
