package Part3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium dependency\\drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.snapdeal.com/");
        WebElement inputValEnter = driver.findElement(By.id("inputValEnter"));
        inputValEnter.sendKeys("teddy bear");
        WebElement searchTextSpan = driver.findElement(By.className("searchTextSpan"));
        searchTextSpan.click();
        WebElement nnn = driver.findElement(By.className("nnn"));
        Thread.sleep(3000);
        System.out.println(nnn.getText());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.findElement(By.className("notIeLogoHeader")).click();
        driver.getCurrentUrl();



    }

    /*
        1) Navigate to https://www.snapdeal.com/

        2) Search for teddy bear click on search button

        3) Print the following text -->> We've got .... results for 'teddy bear'

        4) Print the URL

        5) Click on logo snepdeal logo

        6) Print the URL

     */


}
