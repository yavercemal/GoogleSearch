import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

    public  String baseUrl="https://www.google.com/";
    public  WebDriver driver;

    @BeforeTest
    public  void setBaseUrl() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void googleSearch() {
        WebElement googleSearch = driver.findElement(By.name("q"));
        //write textboxt
        googleSearch.sendKeys("Turkey");
        //find button
        WebElement searchButton = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
        //click button
        searchButton.click();
    }

    @AfterTest
    public void endSession() {
        driver.quit();
    }

}
