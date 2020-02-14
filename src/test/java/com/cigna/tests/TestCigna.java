package com.cigna.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;  // * will cover everything(before, after, test)

public class TestCigna {


    WebDriver driver;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/dibashsaha/Desktop/LearnSetupMaven/DriverHere/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.cigna.com/");
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }




    @Test(priority = 1)
    public void ValidateLogo(WebDriver driver) throws InterruptedException {


        driver.findElement(By.cssSelector("#includes-content > div.d-none.d-lg-block > nav:nth-child(2) > div > a > svg")).click(); //logo validate
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void ValidateCignaInternational() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"includes-content\"]/div[1]/nav[1]/div/ul/li[1]/a")).click();
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual,"https://www.cigna.com/international/");
        Thread.sleep(2000);

    }

    @Test(priority = 3)
    public void ValidateContactUs() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"1438512008862\"]/div/div[4]/div/nav[1]/div/ul[2]/li[3]/a")).click();
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual,"https://www.cigna.com/contact-us/");
        Thread.sleep(2000);

    }

    @Test(priority = 4)
    public void ValidateEspanol() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"includes-content\"]/div[1]/nav[1]/div/ul/li[3]/a")).click();
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual,"https://www.cigna.com/es-us/contact-us/");
        Thread.sleep(3000);

    }
    @Test(priority = 5)
    public void ValidateEmployerAndBroker() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"includes-content\"]/div[1]/nav[3]/div/ul/li[2]/a")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 6)
    public void ValidateAboutUs() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"includes-content\"]/div[1]/nav[3]/div/ul/li[4]/a")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 7)
    public void ValidateSearchBox() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"csng-search-header\"]/search-header-bar/form/div/cigna-typeahead/input")).sendKeys("Contact us");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"csng-search-header\"]/search-header-bar/form/div/cigna-typeahead/div/button")).click();
        Thread.sleep(2000);

    }

    @Test(priority = 8)
    public void LocationFindertab() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[1]/a")).click();
        Thread.sleep(5000);

    }
    @Test(priority = 9)
    public void LogIntoMyCigna() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[2]/a")).click();
        Thread.sleep(5000);

    }
    @Test(priority = 10)
    public void ValidateHealthCareProvider() throws InterruptedException {

        driver.findElement(By.linkText("Health Care Providers")).click();
        Thread.sleep(3000);
    }
    @Test(priority = 11)
    public void Credential_UnderHCP() throws InterruptedException {
       ValidateHealthCareProvider();
        driver.findElement(By.xpath("//*[@id=\"nav-item-l2-credentialing\"]/button")).click(); // credential drop down
        Thread.sleep(1000);
    }
    @Test(priority = 12)
    public void CoverageAndClaim_UnderHCP() throws InterruptedException {
        ValidateHealthCareProvider();
        driver.findElement(By.xpath("//*[@id=\"nav-item-l2-coverage-and-claims\"]/button")).click();
        Thread.sleep(1000);
    }
    @Test(priority = 13)
    public void Pharmacy_UnderHCP() throws InterruptedException {
        ValidateHealthCareProvider();
        driver.findElement(By.xpath("//*[@id=\"nav-item-l2-pharmacy\"]/button")).click();
        Thread.sleep(1000);
    }
    @Test(priority = 14)
    public void ProviderResources_UnderHCP() throws InterruptedException {
        ValidateHealthCareProvider();
        driver.findElement(By.xpath("//*[@id=\"nav-item-l2-resources\"]/button")).click();
        Thread.sleep(1000);
    }

    @Test(priority = 15)
    public void ValidateJoinInTab() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"1571567674833\"]/div/div/div[2]/div[1]/p[2]/a")).click();
        Thread.sleep(7000);
    }
    @Test(priority = 16)
    public void ValidateJoinInTabExtention() throws InterruptedException {
        driver.findElement(By.linkText("Health Care Providers")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("firstname")).sendKeys("wwww.dibash.com");
        Thread.sleep(2000);
    }
    @Test(priority = 17)
    public void Validate_LearnMoreAboutTransactionLink() throws InterruptedException {

        driver.findElement(By.linkText("Learn more about the transaction.")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.cigna.com/about-us/newsroom/new-york-life-to-acquire-cignas-group-disability-and-life-insurance-business");
        Thread.sleep(3000);
    }
    @Test(priority = 18)
    public void Validate_HealthInsuranceForIndividualTab() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"1564310141632\"]/div/div[1]/div[1]/div/div[1]/div[2]/a")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.cigna.com/individuals-families/plans-services/health-insurance-plans/#filter/state//county/");
        Thread.sleep(3000);
    }
    @Test(priority = 19)
    public void Validate_DentalInsuranceTab() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"1564310141632\"]/div/div[1]/div[1]/div/div[2]/div[2]/a")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.cigna.com/individuals-families/plans-services/dental-insurance-plans/");
        Thread.sleep(2000);
    }
    @Test(priority = 20) // Error this one //
    public void Validate_MedicarePlansTab() throws InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"1564310141632\"]/div/div[1]/div[1]/div/div[3]/div[2]/a")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.cigna.com/medicare/");
        Thread.sleep(3000);
    }
    @Test(priority = 21) //Same issue when open new tab//
    public void ValidateMedicareSupplementTab() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"1564310141632\"]/div/div[1]/div[1]/div/div[4]/div[2]/a")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.cigna.com/medicare/supplemental/?campaign_ID=CSBORG");
        Thread.sleep(2000);
    }
    @Test(priority = 22)
    public void Validate_OthersupplementInsuranceTab() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"1564310141632\"]/div/div[1]/div[1]/div/div[5]/div[2]/a")).click();
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual,"https://www.cigna.com/individuals-families/plans-services/supplemental/");
        Thread.sleep(2000);
    }
    @Test(priority = 23)
    public void Validate_InternationalHealthInsuranceTab() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"1564310141632\"]/div/div[1]/div[1]/div/div[6]/div[2]/a")).click();
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(actual,"https://www.cigna.com/international/");
        Thread.sleep(2000);
    }
    @Test(priority = 24)
    public void Validate_EmployeeplanAndPolicies() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"1564310141632\"]/div/div[3]/div[1]/div/div[1]/div[2]/h4/a")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.cigna.com/individuals-families/plans-services/plans-through-employer/#filter=plantype/medical-plans");
        Thread.sleep(2000);
    }
    @Test(priority = 25) //This tab have issue from the organizers side //
    public void Validate_EmployerSolution() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"1564310141632\"]/div/div[3]/div[1]/div/div[2]/div[2]/h4/a")).click();
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, "https://www.cigna.com/employers-brokers/plans-services/#filter=plantype/medical-plans/group/all-group-sizes");
        Thread.sleep(2000);
    }



  /*  @Test (priority = 26)    //problem in this part
    public void InputUserInfo() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[2]/a")).click(); //opens userInput Tab//
        Thread.sleep(3000);
        for(String child:driver.getWindowHandles()){
            driver.switchTo().window(child);
        }

        driver.findElement(By.id("username")).sendKeys("testing");
        driver.findElement(By.id("password")).sendKeys("testing");

        Thread.sleep(14000);
    }*/


}

