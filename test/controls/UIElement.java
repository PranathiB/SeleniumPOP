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
    private WebDriverWait wait;

    public UIElement(WebDriver driver, String id) {
        this.driver = driver;
        this.id = id;
        this.wait = new WebDriverWait(driver,10);
    }

    protected WebElement element(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        return driver.findElement(By.id(id));
    }

    public void assertContains(String txt) {
        assertThat(element().getText(),containsString(txt));
    }

    public void assertHasCSSClass(String cssClass) {
        String actualCSSClasses = element().getAttribute("class");
        assertThat(actualCSSClasses,containsString(cssClass));
    }
}
