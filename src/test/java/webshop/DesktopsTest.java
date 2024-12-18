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
    }
}
