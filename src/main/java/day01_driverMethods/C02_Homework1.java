package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Homework1 {
    public static void main(String[] args) {
        /*
        1.Yeni bir class olusturalim (Homework)
        2.ChromeDriver kullanarak, facebook sayfasina gidin ve
        sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify),
        degilse dogru basligi yazdirin.
        3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin,
        icermiyorsa “actual” URL’i yazdirin.
        4.https://www.walmart.com/ sayfasina gidin.
        5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        6. Tekrar “facebook” sayfasina donun
        7. Sayfayi yenileyin
        8. Sayfayi tam sayfa (maximize) yapin
        9.Browser’i kapatin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");

        String expectedTitleIcerik="facebook";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title testi FAILED");


        }


        String expectedUrlIcerik="facebook";
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Url test PASSED");
        } else {
            System.out.println("Url test FAILED");
            System.out.println("actual Url : "+ actualUrl);
            System.out.println("Actual Url aranan " + expectedUrlIcerik + "kelimesini icermiyor");
        }


    }
}
