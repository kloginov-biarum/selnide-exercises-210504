package webshop;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ItemPage {

    private SelenideElement freeShippingLabel = $(".free-shipping");


    public void checkFreeShippingLabel(){
        freeShippingLabel.shouldBe(Condition.visible);
    }
}

