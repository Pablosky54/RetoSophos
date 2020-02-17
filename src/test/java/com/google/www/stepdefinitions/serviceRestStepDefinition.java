package com.google.www.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.google.www.models.Rest;
import com.google.www.task.ConsultUser;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class serviceRestStepDefinition {
	
	@Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
	
	
	@When("^\"([^\"]*)\" send petition$")
	public void sendPetition(String actor){
		
		theActorCalled(actor).attemptsTo();
	    
	}


	@Then("^I valid that the user exists (.*) (.*)$")
	public void iValidThatTheUserExists(String name, String lastName){	
		
		
		theActorInTheSpotlight().attemptsTo(ConsultUser.with(Rest.CONSULT.toString(), name, lastName));
	    
	}

}
