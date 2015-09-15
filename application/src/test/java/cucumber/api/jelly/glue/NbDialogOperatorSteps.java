/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cucumber.api.jelly.glue;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.netbeans.jellytools.NbDialogOperator;
import org.netbeans.jellytools.actions.ActionNoBlock;
import org.netbeans.jemmy.TimeoutExpiredException;
import org.netbeans.jemmy.Timeouts;
import org.netbeans.jemmy.operators.ComponentOperator;

/**
 *
 * @author nick
 */
public class NbDialogOperatorSteps {    
/**/    
    @When("^I can click the \"([^\"]*)\" close button$")
    public void clickTheCloseButton(String dialog) {
        new NbDialogOperator(dialog).closeByButton();
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
    
    @Then("^the \"([^\"]*)\" Dialog is hidden$")
    public void theDialogIsHidden(String dialog) {
        assertThat("The '"+dialog+"' Dialog is hidden",dialogVisable(dialog,false),is(false));
    }    

    @Then("^the \"([^\"]*)\" Dialog is displayed$")
    public void theDialogIsDisplayed(String dialog) {
        assertThat("The '"+dialog+"' Dialog is displayed",dialogVisable(dialog,true),is(true));
    }
/**/ 
}
