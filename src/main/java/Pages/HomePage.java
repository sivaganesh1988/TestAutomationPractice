package Pages;

import Base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends PageBase {
    WebDriverWait wait = new WebDriverWait(driver, 30);

    public HomePage() {

    }

    public void navigateToHomePage(){
        driver.get("http://automationpractice.com/");
    }


    public void GotoTshirtsPage() {

        WebElement element = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
        element.click();
    }


    public void clickLogin() {
       // WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("login")));
        //loginButton.click();

        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("account")));
        loginButton.click();
    }
}
