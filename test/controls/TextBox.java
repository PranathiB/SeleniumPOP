package controls;

import org.openqa.selenium.WebDriver;

public class TextBox extends UIElement {

    public TextBox(WebDriver driver, String id) {
        super(driver, id);
    }

    public void fill(String text) {
            element().sendKeys(text);
    }

}
