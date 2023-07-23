import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class homework { private WebDriver driver;
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
        public void createuser() throws InterruptedException {
            driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
            driver.manage().window().setSize(new Dimension(1200, 1236));
            Thread.sleep(300);
            driver.findElement(By.cssSelector(".btn-outline-white")).click();

            driver.findElement(By.cssSelector(".btn-link:nth-child(1)")).click();


            driver.findElement(By.id("signupName")).sendKeys("Vlad");

            driver.findElement(By.id("signupLastName")).sendKeys("Alex");

            driver.findElement(By.id("signupEmail")).sendKeys("avk2001@gmail.com");

            driver.findElement(By.id("signupPassword")).sendKeys("ae0089emI");

            driver.findElement(By.id("signupRepeatPassword")).sendKeys("ae0089emI");
             Thread.sleep(800);
            driver.findElement(By.cssSelector(".btn-primary:nth-child(1)")).click();
             Thread.sleep(1200);


            driver.findElement(By.cssSelector(".close > span")).click();
            driver.findElement(By.linkText("Settings")).click();
            driver.findElement(By.cssSelector(".btn-danger-bg")).click();
            driver.findElement(By.cssSelector(".btn-danger")).click();

    }
    @Test
    public void checkUser() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.manage().window().setSize(new Dimension(1200, 1236));
        Thread.sleep(300);
        driver.findElement(By.cssSelector(".btn-outline-white")).click();

        driver.findElement(By.cssSelector(".btn-link:nth-child(1)")).click();


        driver.findElement(By.id("signupName")).sendKeys("Vlad");

        driver.findElement(By.id("signupLastName")).sendKeys("Alex");

        driver.findElement(By.id("signupEmail")).sendKeys("avk2001@gmail.com");

        driver.findElement(By.id("signupPassword")).sendKeys("ae0089emI");

        driver.findElement(By.id("signupRepeatPassword")).sendKeys("ae0089emI");
        Thread.sleep(800);
        driver.findElement(By.cssSelector(".btn-primary:nth-child(1)")).click();
        Thread.sleep(1200);
        driver.findElement(By.id("userNavDropdown")).click();
        Thread.sleep(800);
        driver.findElement(By.cssSelector(".user-nav_menu-group > .dropdown-item:nth-child(2)")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".profile")).click();
        Thread.sleep(500);
        assertThat(driver.findElement(By.cssSelector(".profile_name")).getText(), is("Vlad Alex"));
        Thread.sleep(500);


    }
    @Test
    public void createCar() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.manage().window().setSize(new Dimension(1200, 1236));

        driver.findElement(By.cssSelector(".btn-outline-white")).click();
        driver.findElement(By.id("signinEmail")).sendKeys("avk2001@gmail.com");
        driver.findElement(By.id("signinPassword")).sendKeys("ae0089emI");

        driver.findElement(By.cssSelector(".btn-primary:nth-child(2)")).click();
        Thread.sleep(800);
        driver.findElement(By.cssSelector(".btn-primary")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".btn-primary"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.id("addCarBrand")).click();
        {
            WebElement dropdown = driver.findElement(By.id("addCarBrand"));
            dropdown.findElement(By.xpath("//option[. = 'BMW']")).click();
        }
        driver.findElement(By.id("addCarModel")).click();
        {
            WebElement dropdown = driver.findElement(By.id("addCarModel"));
            dropdown.findElement(By.xpath("//option[. = 'X5']")).click();
        }
        driver.findElement(By.id("addCarMileage")).click();
        driver.findElement(By.id("addCarMileage")).sendKeys("500");
        driver.findElement(By.cssSelector(".modal-footer > .btn-primary")).click();
    }
    @Test
    public void addExpenses() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.manage().window().setSize(new Dimension(1200, 1236));
        driver.findElement(By.cssSelector(".btn-outline-white")).click();
        driver.findElement(By.id("signinEmail")).sendKeys("avk2001@gmail.com");
        driver.findElement(By.id("signinPassword")).sendKeys("ae0089emI");
        driver.findElement(By.cssSelector(".btn-primary:nth-child(2)")).click();
        Thread.sleep(800);
        driver.findElement(By.cssSelector(".car-item:nth-child(1) .car_add-expense")).click();

        driver.findElement(By.id("addExpenseMileage")).click();

        driver.findElement(By.id("addExpenseMileage")).clear();
        driver.findElement(By.id("addExpenseMileage")).sendKeys("560");

        driver.findElement(By.id("addExpenseLiters")).sendKeys("15");

        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("25000");
        driver.findElement(By.cssSelector(".modal-footer > .btn-primary")).click();
        driver.findElement(By.id("addExpenseMileage")).click();
        driver.findElement(By.cssSelector(".modal-footer > .btn-primary")).click();

    }
    @Test
    public void deleteUser() throws InterruptedException {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        driver.manage().window().setSize(new Dimension(1200, 1236));
        driver.findElement(By.cssSelector(".btn-outline-white")).click();
        driver.findElement(By.id("signinEmail")).sendKeys("avk2001@gmail.com");
        driver.findElement(By.id("signinPassword")).sendKeys("ae0089emI");
        driver.findElement(By.cssSelector(".btn-primary:nth-child(2)")).click();
        Thread.sleep(800);
        driver.findElement(By.linkText("Settings")).click();
        driver.findElement(By.cssSelector(".btn-danger-bg")).click();
        driver.findElement(By.cssSelector(".btn-danger")).click();
    }

}

