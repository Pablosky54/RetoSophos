package com.google.www.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.google.www.models.Product;
import com.google.www.questions.ValidateAddCar;
import com.google.www.task.AddProductToShoppingCart;
import com.google.www.task.OpenTheBrowser;
import com.google.www.ui.HomeMetro;
import com.google.www.ui.SearchProduct;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class BuyProductStepDefinition {
	
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
		
		theActorInTheSpotlight().attemptsTo(AddProductToShoppingCart.withTheName(Product.PRODUCT.toString()));
	    
	}

	@Then("^I should see that the product was added successfully$")
	public void iShouldSeeThatTheProductWasAddedSuccessfully(){
		
		theActorInTheSpotlight().should(seeThat(ValidateAddCar.is()));
	    
	}
}
