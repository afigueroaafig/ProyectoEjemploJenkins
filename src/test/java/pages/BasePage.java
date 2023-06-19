package pages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;
    
    

static{

    System.setProperty("webdriver.chrome.driver","C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\SeleniumGoogle2\\chromedriver.exe");
    ChromeOptions chromeOptions = new ChromeOptions();
    driver = new ChromeDriver(chromeOptions);
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

public BasePage(WebDriver driver){
    BasePage.driver = driver;
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

public static void navigateTo(String url){
    driver.get(url);
    }

public void salirPagina (){
    driver.quit();
    }         

private WebElement find(String locator){
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

public void clickElement(String locator){
    find(locator).click();
    }      

public void ingresarBusqueda (String locator, String texto){
    find(locator).clear();
    find(locator).sendKeys(texto);
    }  

public void selectFromDropdownByValue(String locator, String valueToSelect){
    Select dropdown = new Select (find(locator));
    dropdown.selectByValue(valueToSelect);
}

public void selectFromDropdownByIndex(String locator, int valueToSelect){
    Select dropdown = new Select (find(locator));
    dropdown.selectByIndex(0);
}



}
