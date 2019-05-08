import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenu.click();

        WebElement selectAutocomplete = driver.findElement(By.id("autocomplete"));
        selectAutocomplete.click();

        dropdownMenu.click();

        WebElement selectAnotherItem = driver.findElement(By.xpath("/html/body/div/div/div/a[6]"));
        selectAnotherItem.click();

        driver.quit();
    }
}
