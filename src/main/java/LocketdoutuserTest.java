// Generated by Selenium IDE
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class LocketdoutuserTest {
    private WebDriver driver;
    @Before

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
@Test
    public void lockedoutuserTest() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().setSize(new Dimension(1200, 1236));
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
        assertThat(driver.findElement(By.cssSelector("*[data-test=\"error\"]")).getText(), is("Epic sadface: Sorry, this user has been locked out."));
    }








}
