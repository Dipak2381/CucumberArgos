package CucumberArgos;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static CucumberArgos.BasePage.driver;

/**
 * Created by DIPAK on 4/24/2017.
 */
public class MyStepsDef extends BaseTest
{
    @Given("^I am  already home page$")
    public void I_am_already_home_page() {
        openBrowser();
    }

    @When("^I click on clearance$")
    public void I_click_on_clearance() {
        driver.findElement(By.xpath("//a[contains(text(),'Clearance')]")).click();

    }

    @Then("^I see I am on clearance page$")
    public void I_see_I_am_on_clearance_page() {
        Assert.assertTrue(driver.getCurrentUrl().contains("clearance"));
    }

    @When("^I click on home and garden$")
    public void I_click_on_home_and_garden() {
        driver.findElement(By.xpath("//div[2]/div/div/a[2]")).click();

    }

    @Then("^I see I am on clearance home and garden page$")
    public void I_see_I_am_on_clearance_home_and_garden_page() {
        //verify  user is clearance home and garden  page
        Assert.assertEquals("Clearance Home & garden",driver.findElement(By.xpath("//div[1]/div[2]/h2")).getText());
    }

    @When("^I click on garden furniture$")
    public void I_click_on_garden_furniture() {
        driver.findElement(By.xpath("//a[contains(text(),'Garden furniture (1)')]")).click();

    }

    @Then("^I can see garden furniture page$")
    public void I_can_see_garden_furniture_page() {
     // verify user on garden furniture page
        Assert.assertEquals("Garden furniture (1 products)",driver.findElement(By.xpath("//div[@id='categorylist']/h2")).getText());
    }
}
