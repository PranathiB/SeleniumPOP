import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import models.UserLoginDetails;

public class ClearTripLoginTest {

    private static ChromeDriver driver;
    private static WebDriverWait wait;

    @BeforeClass
    public static void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","resources/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void shouldShowErrorForInValidPassword() throws InterruptedException {
        new LoginPage(driver).open()
                             .fillDetails(UserLoginDetails.INVALID_USER_DETAILS)
                             .clickLogin()
                             .assertIsShowingLoginError();
    }

}
