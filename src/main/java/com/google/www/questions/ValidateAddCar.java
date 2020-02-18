package com.google.www.questions;

import static com.google.www.ui.SearchProduct.VALID_BOTTON;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateAddCar implements Question<Boolean> {
	
	
    public ValidateAddCar() {}

	@Override
    public Boolean answeredBy(Actor actor) {
    	
        return Text.of(VALID_BOTTON).viewedBy(actor).asString().equals("en el carrito");
    }

    public static ValidateAddCar is(){
        return new ValidateAddCar();
    }
}