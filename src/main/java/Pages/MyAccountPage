package Pages;

import Base.PageBase;
import org.openqa.selenium.By;

public class MyAccountPage extends PageBase {

    public void navigateToPersonalInfoPage(){
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span")).click();
    }

    public void updateFirstName(){
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Sivaa");
        driver.findElement(By.name("old_passwd")).sendKeys("Newpass123");
        driver.findElement(By.name("submitIdentity")).click();
    }
}
