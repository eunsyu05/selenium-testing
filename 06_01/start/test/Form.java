import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Susi");

        driver.findElement(By.id("last-name")).sendKeys("Susilawati");

        driver.findElement(By.id("job-title")).sendKeys("Software Quality Engineering");

        driver.findElement(By.id("radio-button-3")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("options[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("04/30/2019");

        driver.findElement(By.cssSelector("btn.btn-lg.btn-primary")).click();

        driver.quit();
    }
}
