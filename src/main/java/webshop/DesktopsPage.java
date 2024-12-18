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
}
