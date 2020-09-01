
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day01_DriverKomutlari {

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup(); // chrome driveri kurduk
        WebDriver driver = new ChromeDriver();   // Driver nesnemizi 'imizi olusturduk
        driver.manage().window().maximize();     // Driver'i tam ekran yaptik
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // WebElement'lerin yuklenmesi icin bekleme ekledik
        driver.get("http://google.com");

        //Navigate tuslari
        driver.navigate().back(); // bir onceki sayfaya geri doner.
        driver.navigate().to("http://amazon.com"); // herhangi bir web sayfasina gider
        driver.navigate().forward(); // ileri sayfaya gider
        driver.navigate().refresh();  // Sayfayi yeniler
        driver.quit(); // driveri kapatmaki icin kullanilir
        driver.close();// acik olan sekmeyi kapatir


    }


}
