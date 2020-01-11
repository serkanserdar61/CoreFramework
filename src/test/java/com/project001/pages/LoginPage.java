package com.project001.pages;

import com.project001.utilities.BrowserUtils;
import com.project001.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"scrollingNav\"]/ul/li/a")
    public List<WebElement> navListItems;

    @FindBy(xpath = "//*[@id=\"api-Booking-GetBookings-1.0.0\"]/table[1]/tbody/tr/td[1]")
    public List<WebElement> getBookingIds;




    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }



    public void clickOnNavigationItem(String name) {
        List<WebElement> list = navListItems;

        for (WebElement item:list) {
            if(item.getText().equalsIgnoreCase(name)){
                System.out.println("Cliked on " + item.getText());
                item.click();
                BrowserUtils.wait(2);
                break;
            }
        }

    }

    public List<String> verifyGetBookingIdsItem() {

        List<String> list = new ArrayList<>();

        for (WebElement item:getBookingIds) {
         list.add(item.getText());
        }
        return list;

    }






}
