package com.kodilla.testing2.facebook;


import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        while(!driver.findElement(By.xpath(XPATH_DAY)).isDisplayed());

        WebElement dayField = driver.findElement(By.xpath(XPATH_DAY));
        Select selectCombo = new Select(dayField);
        selectCombo.selectByValue("28");

        while(!driver.findElement(By.xpath(XPATH_MONTH)).isDisplayed());

        WebElement monthField = driver.findElement(By.xpath(XPATH_MONTH));
        selectCombo = new Select(monthField);
        selectCombo.selectByIndex(10);

        while(!driver.findElement(By.xpath(XPATH_YEAR)).isDisplayed());

        WebElement yearField = driver.findElement(By.xpath(XPATH_YEAR));
        selectCombo = new Select(yearField);
        selectCombo.selectByValue("1986");
    }
}
