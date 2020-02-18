package com.google.www.questions;

import static com.google.www.ui.SearchProduct.VALID_BOTTON;

import com.google.www.models.Product;
import com.google.www.ui.SearchProduct;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateAddCar implements Question<Boolean> {
	
	
    public ValidateAddCar() {}

	@Override
    public Boolean answeredBy(Actor actor) {
    	
        return VALID_BOTTON.of(Product.PRODUCT.toString()).resolveFor(actor).isVisible();
    }

    public static ValidateAddCar is(){
        return new ValidateAddCar();
    }
}