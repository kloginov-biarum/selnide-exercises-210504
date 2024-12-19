package webshop;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesktopsPage {

    private SelenideElement pageSizeDropdown = $("#products-pagesize");

    public void pageSizeDropDownIsDisplayed(){
        pageSizeDropdown.shouldBe(Condition.visible);
    }

    public void clickPageSizeDropdown(){
        pageSizeDropdown.click();
    }

    private SelenideElement sizeDropDownOption4 = $("#products-pagesize option:nth-child(1)");

    private SelenideElement sizeDropDownOption8 = $("#products-pagesize option:nth-child(2)");

    private SelenideElement sizeDropDownOption12 = $("#products-pagesize option:nth-child(3)");

    public void select12Items(){
        sizeDropDownOption12.click();
    }
    public void select4Items(){
        sizeDropDownOption4.click();
    }

    public void select8Items(){
        sizeDropDownOption8.click();
    }
    private ElementsCollection productItems = $$(".item-box");

    public void checkItemsQuantity(int expectedItemsSize){
        productItems.shouldHave(CollectionCondition.size(expectedItemsSize));
    }

    private ElementsCollection addToCartButtons = $$("[value=\"Add to cart\"]");

    public void checkAddCardsButtons(int expectedCardsButton){
        addToCartButtons.shouldHave(CollectionCondition.size(expectedCardsButton));
    }

    private ElementsCollection itemPrices = $$(".actual-price");

    public void checkPricesAreDisplayed(int expectedQuantityPrices) {
        itemPrices.shouldHave(CollectionCondition.size(expectedQuantityPrices));
    }

    public void clickOnAddToCardButtonOfFirstItem(){
        addToCartButtons.get(0).click();
    }
}
