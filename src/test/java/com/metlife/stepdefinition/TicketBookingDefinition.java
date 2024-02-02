package com.metlife.stepdefinition;

import com.metlife.utility.rb_WebdriverUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.metlife.utility.rb_WebdriverUtility.*;

import static com.metlife.pageobjects.rb_homepage_Objects.*;
import static com.metlife.pageobjects.rb_homepage_Objects.cmbt;
import static com.metlife.utility.rb_WebdriverUtility.*;
import static com.metlife.utility.rb_WebdriverUtility.click;

public class TicketBookingDefinition {

    @Given("I Log into redbus.in as a user")
    public void i_log_into_redbus_in_as_a_user() {
        initialize("gc");
        NavigateURL("https:redbus.in");
        
    }
    @When("I update the source as {string}")
    public void i_update_the_source_as(String string) throws InterruptedException {
        type(from,string);
        click(sindhicamp);
    }
    @When("I update the destination as {string}")
    public void i_update_the_destination_as(String string) throws InterruptedException {
        type(destination, string);
        click(cmbt);
    }
    @When("I choose the date as 4th of next month")
    public void i_choose_the_date_as_4th_of_next_month() {

    }
    @When("I click on search Busses")
    public void i_click_on_search_busses() {

    }
    @Then("I should get the message {string}")
    public void i_should_get_the_message(String string) {

    }

}
