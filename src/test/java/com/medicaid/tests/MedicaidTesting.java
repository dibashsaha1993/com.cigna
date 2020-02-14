package com.medicaid.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MedicaidTesting {

    WebDriver driver;

    @BeforeTest
    public void Setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/dibashsaha/Desktop/LearnSetupMaven/DriverHere/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.medicaid.gov/");
    }

    @AfterTest
    public void TearDown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void ValidateLogo() {
        driver.findElement(By.xpath("//*[@id=\"site_header\"]/div[1]/a/h1/img")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.medicaid.gov/index.html");
    }

    @Test(priority = 2)
    public void Validate_Archieve() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"ubermenu-main-2-primary\"]/div/div/ul/li[2]/a")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.medicaid.gov/");
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void Validate_SiteMap() throws InterruptedException {
        driver.findElement(By.linkText("Site Map")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.medicaid.gov/sitemap/index.html");
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void Validate_FAQ() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"ubermenu-main-2-primary\"]/div/div/ul/li[4]/a")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.medicaid.gov/faq/index.html");
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void Validate_SearchTab() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"ubermenu-main-2-primary\"]/div/div/ul/li[1]/button")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.medicaid.gov/");
        Thread.sleep(4000);
    }

    @Test(priority = 6)
    public void Validate_SearchWithInputTab() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"ubermenu-main-2-primary\"]/div/div/ul/li[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]")).sendKeys("hello Medic");
        driver.findElement(By.xpath("//form[@id='search_form']//div//button")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://search.usa.gov/search?affiliate=medicaid&query=hello%20Medic&commit=Search");
        Thread.sleep(4000);
    }

    @Test(priority = 7)
    public void Validate_FederalPoilicyGuidance() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"ubermenu-main-2-primary\"]/div/ul/li[1]/a/span")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.medicaid.gov/federal-policy-guidance/index.html");
        Thread.sleep(4000);
    }

    @Test(priority = 8)
    public void Validate_ResourcesForState() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"ubermenu-main-2-primary\"]/div/ul/li[2]/a/span")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.medicaid.gov/state-resource-center/index.html");
        Thread.sleep(4000);
    }

    @Test(priority = 9)// error finding locator //
    public void Validate_Medicaid() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"mainmenu-menu-link-content30cb2d49-80d2-4c11-be23-6b614e9aa5e0\"]/a/span")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.medicaid.gov/medicaid/index.html");
        Thread.sleep(4000);
    }

    @Test(priority = 10)
    public void Validate_Chip() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"ubermenu-main-2-primary\"]/div/ul/li[4]")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.medicaid.gov/chip/index.html");
        Thread.sleep(4000);
    }

    @Test(priority = 11)
    public void Validate_BasicHealthProgram() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"mainmenu-menu-link-contentc0d80cea-c2fa-4862-bff5-c3897c9f325d\"]/a/span")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.medicaid.gov/basic-health-program/index.html");
        Thread.sleep(4000);
    }

    @Test(priority = 12)
    public void Validate_CIBNewExtention() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'CIB: New Extension of the Affordable Care Act')]")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.medicaid.gov/");
        Thread.sleep(4000);
    }

    @Test(priority = 13)
    public void Validate_MedicaidAndChip() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[2]/ul/li[2]/span/a")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.medicaid.gov/medicaid/program-information/medicaid-and-chip-enrollment-data/report-highlights/index.html");
        Thread.sleep(4000);
    }

    @Test(priority = 14)
    public void Validate_BasicHealthProgramFunding() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Basic Health Program Funding Methodology Proposed')]")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.medicaid.gov/");
        Thread.sleep(4000);
    }

    @Test(priority = 15)
    public void Validate_SMDHealthyAdultCommunity() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'SMD: Healthy Adult Opportunity Demonstration')]")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.medicaid.gov/");
        Thread.sleep(4000);
    }

    @Test(priority = 16)
    public void Validate_RFICoordinatingCareFromOutOfState() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'SMD: Healthy Adult Opportunity Demonstration')]")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.medicaid.gov/");
        Thread.sleep(4000);
    }

    @Test(priority = 17)
    public void Validate_Medicaid_Gov() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='tweeter-heading']")).click();
         String actual = driver.getCurrentUrl();
          Assert.assertEquals(actual, "https://www.medicaid.gov/");
        Thread.sleep(4000);
    }
}