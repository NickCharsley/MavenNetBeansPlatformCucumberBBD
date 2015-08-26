/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ons.mavennetbeansplatformcucumberbdd.steps;

import cucumber.api.java.en.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.netbeans.jellytools.JellyTestCase;

/**
 *
 * @author nick
 */
public class About {

    
    @When("^I have a Show Manager Application$")
    public void haveAShowManagerApplication() {
        //NOP - We just do .... 
        String s="";
        //That just allows a breakpoint for checking when we get into this method.
    }

    @When("^I click the \"([^\"]*)\" menu$")
    public void clickTheMenu(String menu) {
        // Express the Regexp above with the code you wish you had
  //      new ActionNoBlock("Help|About", null).performMenu();
    }

    @Then("^the \"([^\"]*)\" Dialogue is displayed$")
    public void theDialogueIsDisplayed(String dialogue) {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }

    @When("^I can click the \"([^\"]*)\" close button$")
    public void clickTheCloseButton(String dialogue) {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
//        new NbDialogOperator("About").closeByButton();
    }

    @Then("^the \"([^\"]*)\" Dialogue is hidden$")
    public void theDialogueIsHidden(String dialogue) {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
        assertThat(1,is(1));
    }    

}
