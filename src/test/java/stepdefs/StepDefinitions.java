package stepdefs;


        import cucumber.api.PendingException;
        import cucumber.api.java.en.Given;
        import cucumber.api.java.en.Then;
        import cucumber.api.java.en.When;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.By;
        import java.util.concurrent.TimeUnit;

        import static java.lang.Thread.sleep;


public class StepDefinitions {

    public static WebDriver driver;

    @Given("^I am on the page demoaut$")
    public void i_am_on_the_page_demoaut() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://newtours.demoaut.com/");

    }

    @When("^I login$")
    public void i_login() throws Throwable {

        driver.findElement(By.name("userName")).sendKeys("Pino");

        driver.findElement(By.name("password")).sendKeys("123");

        driver.findElement(By.name("login")).click();




    }

    @When("^I click on the \"([^\"]*)\" button$")
    public void i_click_on_the_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("I am the page demoaut")
    public void i_should_see_message() throws Throwable {


        if(driver.getPageSource().contains("Flight Finder"))
        {
            System.out.println("Page loaded");
        }
        else
        {
            throw new PendingException();
        }

    }

    @Then("^I should see the \"([^\"]*)\" button$")
    public void i_should_see_the_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}