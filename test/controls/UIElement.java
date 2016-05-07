package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class UIElement {
    private WebDriver driver;
    private String id;
    private By locator;
    private WebDriverWait wait;

    public UIElement(WebDriver driver, By locator) {
        this.driver = driver;
        this.locator = locator;
        this.wait = new WebDriverWait(driver,10);
    }

    protected WebElement element(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }

    public void assertContains(String txt) {
        assertThat(element().getText(),containsString(txt));
    }

    public void assertHasCSSClass(String cssClass) {
        String actualCSSClasses = element().getAttribute("class");
        assertThat(actualCSSClasses,containsString(cssClass));
    }
}
