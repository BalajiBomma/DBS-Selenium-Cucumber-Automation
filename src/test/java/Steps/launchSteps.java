package Steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.time.Duration;
import java.io.IOException;
import java.nio.file.Files;



public class launchSteps extends BaseClass {



    @Given("Open DBS default page")
    public void Open_DBS_default_page() {
        driver.get("https://www.dbs.com/default.page");
    }

    @When("choose the market India")
    public void choose_the_market_India(){

        Actions action= new Actions(driver);

        WebElement country = driver.findElement(By.xpath("(//*[contains(text(),'You are in DBS Group')])[1]"));
        country.click();

        WebElement india = driver.findElement(By.xpath("//a[contains(text(),'India')]"));
        india.click();

    }
    @Then("go to personal Banking")
    public void go_to_personal_Banking(){
       driver.findElement(By.xpath("(//*[contains(text(),'Personal')])[3]")).click();
    }
    @Then("clicks on personal banking learn more")
    public void clicks_on_personal_banking_learn_more(){
driver.findElement(By.xpath("(//button[contains(text(),'Learn More')])[1]")).click();
    }
    @Then("click customer services select customer care")
    public void click_customer_services_select_customer_care() throws InterruptedException, IOException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement closeAd = wait.until(ExpectedConditions.elementToBeClickable
                    (By.id("closebutton")));
                    closeAd.click();
        } catch (Exception e) {
            System.out.println("Popup not visible or already closed.");
        }

        Actions action= new Actions(driver);
       WebElement Customer= driver.findElement(By.xpath("(//*[contains(text(),'Customer Services')])[2]"));
       Customer.click();


        WebElement customerCareLink = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//a[contains(text(),'Customer Care')])[2]")));


        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", customerCareLink);
        Thread.sleep(500);
        customerCareLink.click();



        File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("./screenshots/CustomerCare_" + System.currentTimeMillis() + ".png");
        dest.getParentFile().mkdirs(); // Ensure folder exists
        FileUtils.copyFile(src, dest);
        System.out.println("✅ Screenshot saved at: " + dest.getAbsolutePath());

    }
}
