package webshop;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement computersTab = $(".top-menu [href=\"/computers\"]");

    public void clickComputersTab(){
        computersTab.click();
    }
}
