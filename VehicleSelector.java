import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VehicleSelector {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        // 1. Select a direct child of .vehicle using CSS combinator (>)
        WebElement childNode = driver.findElement(By.cssSelector(".vehicle > .car"));

        // 2. Select a parent node that contains a specific child using CSS :has()
        WebElement parentWithSpecificChild = driver.findElement(By.cssSelector(".vehicle:has(.electric)"));

        // 3. Get the parent node directly from a child element using XPath
        WebElement parentFromChild = childNode.findElement(By.xpath("./.."));

        System.out.println("Child text: " + childNode.getText());
        System.out.println("Parent tag: " + parentFromChild.getTagName());

        driver.quit();
    }
}
