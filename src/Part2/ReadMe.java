package Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://demo.applitools.com/");

        driver.findElement(By.id("username")).sendKeys("ttechno@gmail.com");
        driver.findElement(By.id("password")).sendKeys("techno123.");
        WebElement element = driver.findElement(By.id("log-in"));
        element.click();
        WebElement time = driver.findElement(By.id("time"));
        System.out.println(time.getText());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }

    /*
        1) Navigate to https://demo.applitools.com/

        2) Enter the username as "ttechno@gmail.com"

        3) Enter the password as "techno123."

        4) Click on sign in button

        5) Get the following text and print it -->  Your nearest branch closes in: 30m 5s is displayed

        6) Print the URL
     */
}
