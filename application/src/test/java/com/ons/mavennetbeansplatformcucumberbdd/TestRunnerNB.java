package com.ons.mavennetbeansplatformcucumberbdd;

import cucumber.api.jelly.Cucumber;
import cucumber.api.jelly.Cucumber.Jelly;
import cucumber.api.jelly.Cucumber.Jelly.Level;
import cucumber.api.junit.Cucumber.Options;
import org.junit.runner.RunWith;

/**
 *
 * @author nick
 */
@RunWith(Cucumber.class)
/**/
@Options(
        format = { "pretty", "html:target/cucumber" }
       ,glue={"com.ons.mavennetbeansplatformcucumberbdd.steps","cucumber.api.jelly.glue"}
       ,monochrome = true
)
/**/
@Jelly(
        gui=true,
        failOnMessage=Level.WARNING,
        failOnException=Level.INFO,
        enableClasspathModules=true, 
        clusters=".*"
)
/**/
public class TestRunnerNB {}
