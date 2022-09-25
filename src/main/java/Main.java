import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","E:\\Java\\ChromeDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.asos.com/men");

        driver.findElements(By.xpath("//div[@class=\"feature__title\"]")).get(1).click();

        List<WebElement> addFavorites = driver.findElements(By.xpath("//button[@class=\"mm1gcXw\"]"));
        addFavorites.get(2).click();
        addFavorites.get(3).click();
        addFavorites.get(4).click();

        WebElement favorites = driver.findElement(By.xpath("//a[@icon=\"_26lJ0fq\"]"));
        favorites.click();

        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        List<WebElement> deleteFavorites = driver.findElements(By.xpath("//button[@aria-label=\"Delete\"]"));
        for(WebElement delete : deleteFavorites){
            delete.click();
        }

        driver.get("https://www.asos.com/");
        WebElement btnAccount = driver.findElement(By.xpath("//*[@id=\"myAccountDropdown\"]/button"));
        btnAccount.click();

        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement btnSignIn = driver.findElement(By.xpath("//*[@id=\"myaccount-dropdown\"]/div/div/div/div/div/span/a[1]"));
        btnSignIn.click();

        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"EmailAddress\"]"));
        emailInput.sendKeys("zhankuatuly1@gmail.com");

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        passwordInput.sendKeys("muchasgracias");

        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"signin\"]"));
        loginBtn.click();

        driver.get("https://www.asos.com/men");
        driver.findElements(By.xpath("//div[@class=\"feature__title\"]")).get(1).click();

        List<WebElement> addProduct = driver.findElements(By.xpath("//div[@class=\"zrNElLX\"]"));
        addProduct.get(2).click();

        WebElement selectBtn = driver.findElement(By.xpath("//select[@aria-label=\"Please select\"]"));
        selectBtn.click();

        WebElement selectSize = driver.findElement(By.xpath("//*[text()='XS - Chest 36']"));
        selectSize.click();

        WebElement addToBag = driver.findElement(By.xpath("//span[@data-bind=\"text: buttonText\"]"));
        addToBag.click();
        //driver.findElements(By.xpath("//button[@data-test-id=\"add-button\"]")).get(0).click();

        WebElement myBag = driver.findElement(By.xpath("//a[@icon=\"AckDUvD\"]"));
        myBag.click();

        WebElement checkout = driver.findElement(By.xpath("//a[@class=\"bag-total-button bag-total-button--checkout bag-total-button--checkout--total\"]"));
        checkout.click();
    }
}
