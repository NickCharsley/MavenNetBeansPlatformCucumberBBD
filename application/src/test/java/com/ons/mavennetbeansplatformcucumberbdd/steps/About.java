/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ons.mavennetbeansplatformcucumberbdd.steps;

import cucumber.api.java.en.*;
import java.io.IOException;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.netbeans.jellytools.NbDialogOperator;
import org.netbeans.jellytools.actions.ActionNoBlock;
import org.netbeans.jemmy.TimeoutExpiredException;
import org.netbeans.jemmy.Timeouts;
import org.netbeans.jemmy.operators.ComponentOperator;
import org.openide.util.Exceptions;
//import org.netbeans.jellytools.JellyTestCase;
//import org.netbeans.jellytools.actions.ActionNoBlock;

/**
 *
 * @author nick
 */
public class About {
    private final boolean doMe=true;
    
    @When("^I have a Show Manager Application$")
    public void haveAShowManagerApplication() {
        //NOP - We just do .... 
        String s="";
        //That just allows a breakpoint for checking when we get into this method.
    }

    @When("^I click the \"([^\"]*)\" menu$")
    public void clickTheMenu(String menu) {
        if (doMe) new ActionNoBlock(menu, null).performMenu();
    }

    @When("^I can click the \"([^\"]*)\" close button$")
    public void clickTheCloseButton(String dialogue) {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
        if (doMe) new NbDialogOperator("About").closeByButton();
    }

    static final boolean dialogVisable(String dialog,boolean visable){       
        NbDialogOperator doDialog=null;
        Timeouts to=ComponentOperator.getEnvironmentOperator().getTimeouts();        
        to.setTimeout("DialogWaiter.WaitDialogTimeout", visable?60000:1000);
        try {
            doDialog=new NbDialogOperator(dialog);
        } catch (TimeoutExpiredException e) {
            //NOP as we are looking for this.
            //Nothing to see here.
        } finally {
            to.setTimeout("DialogWaiter.WaitDialogTimeout", 60000);      
        }
        return doDialog!=null;
    }           
    
    @Then("^the \"([^\"]*)\" Dialogue is hidden$")
    public void theDialogueIsHidden(String dialogue) {
        assertThat("The '"+dialogue+"' Dialogue is hidden",dialogVisable(dialogue,false),is(false));
    }    

    @Then("^the \"([^\"]*)\" Dialogue is displayed$")
    public void theDialogueIsDisplayed(String dialogue) {
        assertThat("The '"+dialogue+"' Dialogue is displayed",dialogVisable(dialogue,true),is(true));
    }
}
