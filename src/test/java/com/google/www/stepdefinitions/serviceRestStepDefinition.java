package com.google.www.stepdefinitions;

import static com.google.www.models.Rest.CONSULT;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import com.google.www.models.Rest;
import com.google.www.task.ConsultUser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;

public class serviceRestStepDefinition {
	
	@Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
	
	
	@When("^\"([^\"]*)\" send petition$")
	public void sendPetition(String actor){
		
		theActorCalled(actor).whoCan(CallAnApi.at(Rest.BASE.toString()));
		
	    
	}


	@Then("^I valid that the user exists (.*) (.*)$")
	public void iValidThatTheUserExists(String name, String lastName){	
		
		
		theActorInTheSpotlight().attemptsTo(ConsultUser.with(CONSULT.toString(), name, lastName));
		theActorInTheSpotlight().should(seeThatResponse(response ->System.out.println(response.statusCode(200))));
		theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(200)));
	    
	}

}
