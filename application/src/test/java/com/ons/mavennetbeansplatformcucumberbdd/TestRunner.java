/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ons.mavennetbeansplatformcucumberbdd;

import cucumber.api.junit.Cucumber;
import cucumber.api.junit.Cucumber.Options;
import org.junit.runner.RunWith;

/**
 *
 * @author nick
 */
@RunWith(Cucumber.class)
@Options(
        format = { "pretty", "html:target/cucumber" }
       ,glue="com.ons.mavennetbeansplatformcucumberbdd.steps"
       ,monochrome = true
)
public class TestRunner {}
