package com.google.www.task;

import static com.google.www.exceptions.AddProductException.ELEMENT_NO_VISIBLE_FAILED_MESSAGE;
import static com.google.www.ui.HomeMetro.SEARCH_BOX;
import static com.google.www.ui.SearchProduct.ADD_BUY_CAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.ElementNotVisibleException;

import com.google.www.exceptions.AddProductException;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class AddProductToShoppingCart implements Task {

    private String nameProduct;

    public AddProductToShoppingCart(String nameProduct){
        this.nameProduct = nameProduct;
    }
    
    @Override
    @Step("{0} add a product to shopping cart on metro website")
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(Enter.theValue(nameProduct+"\n").into(SEARCH_BOX),
            		Click.on(ADD_BUY_CAR));         		
           
            	
            	
        }catch (ElementNotVisibleException e){
            throw new AddProductException(ELEMENT_NO_VISIBLE_FAILED_MESSAGE,e);
        }
    }

    public static AddProductToShoppingCart withTheName(String nameProduct){
        return instrumented(AddProductToShoppingCart.class,nameProduct);
    }
}
