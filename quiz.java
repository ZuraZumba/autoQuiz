import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static java.awt.SystemColor.window;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.testng.AssertJUnit.assertEquals;

public class quiz {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }


    @Test
    public void task_1() {
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='userName']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        usernameField.sendKeys("test123");
        passwordField.sendKeys("Automation@123");
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement logoutbutton = driver.findElement(By.xpath("//button[@id='submit']"));
        assert logoutbutton.isDisplayed();
//
    }

    @Test
    public void task_2() {
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='userName']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        usernameField.sendKeys("test123");
        passwordField.sendKeys("Automation@123");
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"gotoStore\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> books = driver.findElements(By.cssSelector("div[role='rowgroup']"));
        int bookscount=books.size();
        System.out.println(bookscount);
        Assert.assertEquals(bookscount,8);
}
    @Test
    public void task_3() {
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='userName']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        usernameField.sendKeys("test123");
        passwordField.sendKeys("Automation@123");
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"gotoStore\"]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("see-book-Git Pocket Guide")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement title = driver.findElement(By.xpath("//label[text()='Git Pocket Guide']"));
        System.out.println("Title: " + title.getText());
        String text = title.getText();
        Assert.assertEquals("Git Pocket Guide", text);

    }

    @Test
    public void task_4()  {
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='userName']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        usernameField.sendKeys("test123");
        passwordField.sendKeys("Automation@123");
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"gotoStore\"]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("see-book-Git Pocket Guide")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        js.executeScript("window.scrollBy(0,500)", "");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement coll = driver.findElement(By.xpath("//button[text()='Add To Your Collection']"));
        coll.click();

        Alert al = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        String alertmsg = al.getText();
        al.accept();
        System.out.println("Alert Message Is: " + alertmsg);

        Assert.assertEquals("Book already present in the your collection!", alertmsg);
    }
    @Test
    public void task_5()  {
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='userName']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        usernameField.sendKeys("test123");
        passwordField.sendKeys("Automation@123");
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"gotoStore\"]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("see-book-Git Pocket Guide")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        js.executeScript("window.scrollBy(0,500)", "");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement coll = driver.findElement(By.xpath("//button[text()='Add To Your Collection']"));
        coll.click();

        Alert al = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        al.accept();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().back();
        List<WebElement> books = driver.findElements(By.cssSelector("div[role='rowgroup']"));
        System.out.println(books.size());
//        int bookcount=books.size();
//        System.out.println(bookcount);
        Assert.assertEquals(8, books.size());


    }
    @Test
    public void task_6()  {
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='userName']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        usernameField.sendKeys("test123");
        passwordField.sendKeys("Automation@123");
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"gotoStore\"]")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("see-book-Git Pocket Guide")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        js.executeScript("window.scrollBy(0,500)", "");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement coll = driver.findElement(By.xpath("//button[text()='Add To Your Collection']"));
        coll.click();

        Alert al = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        al.accept();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().back();
        WebElement logoutButton = driver.findElement(By.xpath("//button[text()='Log out']"));
        logoutButton.click();
        WebElement zeda = driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[1]/h2"));
        WebElement qveda = driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[1]/h5"));
//        System.out.println(zeda.getText());
//        System.out.println(qveda.getText());
        String wholeText = zeda.getText() + "\n" + "\n" + qveda.getText();
        System.out.println(wholeText);
        Assert.assertEquals(wholeText, "Welcome,\n\nLogin in Book Store");
    }

    @AfterMethod
    public void closeBrowser() {
        System.out.println("Test Finished");
        driver.close();

    }
}
