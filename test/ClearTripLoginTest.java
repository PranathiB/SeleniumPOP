import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import models.UserLoginDetails;

public class ClearTripLoginTest {

    private static FirefoxDriver driver;
    private static WebDriverWait wait;

    @BeforeClass
    public static void setUp() throws Exception {
        driver = new FirefoxDriver();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.close();
    }

    @Test
    public void shouldShowErrorForInValidPassword() throws InterruptedException {
        new LoginPage(driver).open()
                             .fillDetails(UserLoginDetails.INVALID_USER_DETAILS)
                             .clickLogin()
                             .assertIsShowingLoginError();
    }

}
