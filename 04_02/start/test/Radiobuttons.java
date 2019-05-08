import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radionButton1 = driver.findElement(By.id("radio-button-1"));
        radionButton1.click();

        WebElement radionButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radionButton2.click();

        WebElement radionButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radionButton3.click();

        driver.quit();
    }
}
