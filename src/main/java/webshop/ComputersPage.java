package webshop;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ComputersPage {

    private SelenideElement desktopsLink = $x("(//div[@class=\"item-box\"])[1]");

    public void clickDesktopsLink(){
        desktopsLink.click();
    }
}
