/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ons.mavennetbeansplatformcucumberbdd.steps;

import cucumber.annotation.en.*;
import cucumber.runtime.PendingException;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 *
 * @author nick
 */
public class About {
    @Given("^I have a Show Manager Application$")
    public void I_have_a_Show_Manager_Application() {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }

    @When("^I click the \"([^\"]*)\" menu$")
    public void I_click_the_menu(String arg1) {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }

    @Then("^the \"([^\"]*)\" Dialogue is displayed$")
    public void the_Dialogue_is_displayed(String arg1) {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }

    @When("^I can click the \"([^\"]*)\" close button$")
    public void I_can_click_the_close_button(String arg1) {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
        assertThat("",is(this.getClass().getCanonicalName()));
    }

    @Then("^the \"([^\"]*)\" Dialogue is hidden$")
    public void the_Dialogue_is_hidden(String arg1) {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
        assertThat(1,is(0));
    }    
}
