package com.project001.step_definitions;


import com.project001.pages.LoginPage;
import com.project001.utilities.BrowserUtils;
import com.project001.utilities.ConfigurationReader;
import com.project001.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;


public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();


    @When("user is on the restful booker login page")
    public void userIsOnTheRestfulBookerLoginPage() {
        System.out.println("Home Page");
        Driver.get().get(ConfigurationReader.getProperty("url_restful"));

    }

    @Then("user verify the home page subtitles")
    public void userVerifyTheHomePageSubtitles() {
        Assert.assertEquals(loginPage.pageSubTitle.getText(), "Welcome to Restful-Booker");

    }

    @And("user verifies that {string} links")
    public void userVerifiesThatLinks(String link) {

     Assert.assertEquals(link, loginPage.apiDocs.getText());
    }

    @And("user verifies that {string} links displayed")
    public void userVerifiesThatLinksDisplayed(String arg0) {
        Assert.assertEquals(arg0, loginPage.webSite.getText());
    }

    @Then("user log in with following credentials")
    public void userLogInWithFollowingCredentials(Map<String, String> dataTable) {
        System.out.println(dataTable);
        System.out.println("-----------");
        System.out.println(dataTable.get("link1"));
        System.out.println(dataTable.get("link2"));
        Assert.assertEquals(dataTable.get("link1"),loginPage.apiDocs.getText() );
        Assert.assertEquals(dataTable.get("link2"),loginPage.webSite.getText() );


    }

    @Then("user logs website as {string}")
    public void userLogsWebsiteAs(String link) {
        System.out.println(link);

    }

    @Then("user enters {string} then get {string} link")
    public void userEntersThenGetLink(String arg0, String arg1) {
        System.out.println(arg0 + " : ------<");
        System.out.println(arg1 + " : -------<");

    }


    @Then("user navigates to {string}")
    public void userNavigatesTo(String arg0) {
        loginPage.navigateTo(arg0);

    }

    @Then("verify title should be {string}")
    public void verifyTitleShouldBe(String arg0) {
        BrowserUtils.wait(2);
        String title = Driver.get().getTitle();
        System.out.println(title);
        Assert.assertTrue(title.contains(arg0));
    }

    @Then("click on {string}")
    public void clickOn(String item) {
        loginPage.clickOnNavigationItem(item);


    }

    @Then("verify table values {string} , {string} , {string}")
    public void verifyTableValues(String arg0, String arg1, String arg2) {
        List item = loginPage.verifyGetBookingIdsItem();
        Assert.assertTrue(item.get(0).toString().contains(arg0));
        Assert.assertTrue(item.get(1).toString().contains(arg1));
        Assert.assertTrue(item.get(2).toString().contains(arg2));

    }
}
