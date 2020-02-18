package com.google.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/buyProduct.feature",
        glue="com.google.www.stepdefinitions",
        snippets= SnippetType.CAMELCASE,
        monochrome = true)

public class BuyProduct {

}
