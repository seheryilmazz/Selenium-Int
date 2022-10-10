package day03_webElements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_LocatorTesti {

    public static void main(String[] args) {
        /*
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a.web sayfasına gidin. https://www.amazon.com/
        b. Search(ara) “city bike”
        c. Amazon’da görüntülenen ilgili sonuçların sayısını yazdırın
        d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
         */

        //Main method oluşturun ve aşağıdaki görevi tamamlayın.

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //web sayfasına gidin. https://www.amazon.com/

        driver.get("https://www.amazon.com");

        // Search(ara) “city bike”

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();

        // Amazon’da görüntülenen ilgili sonuçların sayısını yazdırın

    }
}
