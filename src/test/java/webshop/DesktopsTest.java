package webshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class DesktopsTest {

    @BeforeEach
    public void setUp(){
        open("https://demowebshop.tricentis.com/");
    }

    @Test
    public void check4Items(){
    //Click on Computers tab
    MainPage mainPage = new MainPage();
    mainPage.clickComputersTab();
    ComputersPage computersPage = new ComputersPage();
    computersPage.clickDesktopsLink();
    DesktopsPage desktopsPage = new DesktopsPage();
    desktopsPage.pageSizeDropDownIsDisplayed();
    desktopsPage.clickPageSizeDropdown();
    desktopsPage.select4Items();
    desktopsPage.checkItemsQuantity(4);
    //Check that 4 prices are displayed
    desktopsPage.checkPricesAreDisplayed(4);
    //Check 4 add to cart buttons are displayed
    desktopsPage.checkAddCardsButtons(4);
    }


    //Check 8 items
    @Test
    public void check8Items(){
        //Click on Computers tab
        //Click on Desktops link
        MainPage mainPage = new MainPage();
        mainPage.clickComputersTab();
        ComputersPage computersPage = new ComputersPage();
        computersPage.clickDesktopsLink();
        DesktopsPage desktopsPage = new DesktopsPage();
        desktopsPage.pageSizeDropDownIsDisplayed();
        desktopsPage.clickPageSizeDropdown();
        //Click on 8 items dropdown option
        desktopsPage.select8Items();
        //Check 8 items are displayed
        desktopsPage.checkItemsQuantity(8);
        desktopsPage.checkAddCardsButtons(8);
    }

    @Test
    public void check12Items(){
        MainPage mainPage = new MainPage();
        mainPage.clickComputersTab();
        ComputersPage computersPage = new ComputersPage();
        computersPage.clickDesktopsLink();
        DesktopsPage desktopsPage = new DesktopsPage();
        desktopsPage.pageSizeDropDownIsDisplayed();
        desktopsPage.clickPageSizeDropdown();
        desktopsPage.select12Items();
        desktopsPage.checkItemsQuantity(12);
        desktopsPage.checkAddCardsButtons(12);
    }


    //Check Add to cart button of the first item leads to page with item description
    @Test
    public void checkFirstItemPage(){
        MainPage mainPage = new MainPage();
        mainPage.clickComputersTab();
        ComputersPage computersPage = new ComputersPage();
        computersPage.clickDesktopsLink();
        DesktopsPage desktopsPage = new DesktopsPage();
        desktopsPage.pageSizeDropDownIsDisplayed();
        desktopsPage.clickOnAddToCardButtonOfFirstItem();
        ItemPage itemPage = new ItemPage();
        itemPage.checkFreeShippingLabel();
    }

}
