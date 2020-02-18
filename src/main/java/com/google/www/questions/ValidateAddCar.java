package com.google.www.questions;

import org.openqa.selenium.support.ui.Wait;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateAddCar implements Question<Boolean> {

    private Target target;

    public ValidateAddCar (Target target){
        this.target = target;
    }


    @Override
    public Boolean answeredBy(Actor actor) {   	
    	
    	try {
			Text.of(target).wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
    	System.out.print("esta es :"+Text.of(target).toString());
    	
        return Text.of(target).equals("");
    }

    public static ValidateAddCar is(Target target){
        return new ValidateAddCar(target);
    }
}