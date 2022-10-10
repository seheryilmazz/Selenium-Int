package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverGetMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        System.out.println(driver.getWindowHandle());
        //bize acilan browser'in handle degerini dondurur
        // CDwindow-0055B565985EB7ECCC84337803404C3F

        driver.getWindowHandles();
        /*
        Eger testimiz sirasinda birden fazla window acilirsa
        acilan tum window'lari window handle degerlerini bir Set olarak dondurur
        window'lar arasi gecisi bu handle degerleri ile yapariz
         */

        driver.get("https://www.amazon.com");
        System.out.println(driver.getPageSource());
        // web sayfasinin tum kaynak kodlarini dondurur

        driver.close();

            }
}
