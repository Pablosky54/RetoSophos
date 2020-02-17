package com.google.www.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.google.www.task.OpenTheBrowser;
import com.google.www.ui.HomeMetro;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class buyProductStepDefinition {
	
	@Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
	
	@Given("^\"([^\"]*)\" open website$")
	public void openWebsite(String actor){
		
		theActorCalled(actor).wasAbleTo(OpenTheBrowser.on(HomeMetro.newInstance()));
	    
	}


	@When("^I add a product to the shopping cart$")
	public void iAddAProductToTheShoppingCart(){
	    
	}

	@Then("^I should see that the product was added successfully$")
	public void iShouldSeeThatTheProductWasAddedSuccessfully(){
	    
	}
}
