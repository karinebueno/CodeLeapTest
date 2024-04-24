import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SignUp {


    @Test
    @DisplayName("When I access the website, the message should be Welcome to CodeLeapNetwork")
    public void SignUpAccess () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\roberto\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String basePage = "http://localhost:3000/";
        driver.get(basePage);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/h1"));
        driver.quit();
    }

    @Test
    @DisplayName("When I access the website, the message should be Welcome to CodeLeapNetwork")
    public void EnterButtonDeactivatedWhenFieldNotFilled () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\roberto\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String basePage = "http://localhost:3000/";
        driver.get(basePage);
        assertFalse(driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/button")).isEnabled());
        driver.quit();
    }

    @Test
    @DisplayName("When I access the website, the message should be Welcome to CodeLeap Network")
    public void UsernameFilled () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\roberto\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String basePage = "http://localhost:3000/";
        driver.get(basePage);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/label/input")).sendKeys("Karine");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/button")).click();
        driver.quit();
    }



}

