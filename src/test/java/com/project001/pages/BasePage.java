package com.project001.pages;

import com.project001.utilities.BrowserUtils;
import com.project001.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {


    @FindBy(css = "body > div.jumbotron.text-center > h1")
    public WebElement pageSubTitle;

    @FindBy(css = "body > div.jumbotron.text-center > p:nth-child(4) > a:nth-child(4)")
    public WebElement apiDocs;

    @FindBy(css = "body > div.jumbotron.text-center > p:nth-child(4) > a:nth-child(2)")
    public WebElement webSite;


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public boolean waitUntilLoaderMaskDisappear() {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 30);
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("body > div.jumbotron.text-center > p:nth-child(2) > a")));
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Loader mask not found!");
            e.printStackTrace();
            return true; // no loader mask, all good, return true
        } catch (WebDriverException e) {
            e.printStackTrace();
        }
        return false;
    }


    public void navigateTo() {

        waitUntilLoaderMaskDisappear();
        apiDocs.click();
        BrowserUtils.waitForPageToLoad(10);
    }

    public void navigateTo(String element) {

        if(apiDocs.getText().equalsIgnoreCase(element)){
            apiDocs.click();
            BrowserUtils.wait(3);

        } else if(webSite.getText().equalsIgnoreCase(element)){
            webSite.click();
            BrowserUtils.wait(3);
        }
    }




    public String getPageSubTitle() {
        waitUntilLoaderMaskDisappear();
        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }

}
