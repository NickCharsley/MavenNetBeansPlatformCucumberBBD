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
}
