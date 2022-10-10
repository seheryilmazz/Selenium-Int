package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {
        /*
        1-C01_TekrarTesti isimli bir class olusturun
        2- https://www.amazon.com/ adresine gidin
        3- Browseri tam sayfa yapin
        4-Sayfayi “refresh” yapin
        5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        6- Gift Cards sekmesine basin
        7- Birthday butonuna basin
        8- Best Seller bolumunden ilk urunu tiklayin
        9- Gift card details’den 25 $’i  secin
        10-Urun ucretinin 25$ oldugunu test edin
        10-Sayfayi kapatin
         */

        //1-C01_TekrarTesti isimli bir class olusturun
        //2-https://www.amazon.com/ adresine gidin
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");

        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle= driver.getTitle();
        String arananMetin=""


        driver.findElements(By.linkText())


    }
}
