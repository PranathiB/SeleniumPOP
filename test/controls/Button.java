package controls;

import org.openqa.selenium.WebDriver;

public class Button extends UIElement {

    public Button(WebDriver driver, String id) {
        super(driver, id);
    }

    public void click() {
        element().click();
    }
}
