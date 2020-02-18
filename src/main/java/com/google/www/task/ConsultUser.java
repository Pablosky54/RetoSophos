package com.google.www.task;

import static com.google.www.models.Rest.AUTHORIZATION;
import static com.google.www.models.Rest.BASE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.google.www.models.Rest;
import com.google.www.util.Consult;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ConsultUser implements Task{
	
	private String user;
	private String userConsult;
	private String name;
	private String lastName;
	
	
    public ConsultUser( String user,String name,String lastName) {
    	this.user = user;
    	this.name =name;
    	this.lastName = lastName;
    }
    
    
    
   
	@Override
	public <T extends Actor> void performAs(T actor) {
		userConsult = Consult.newInstance().generateConsult(user, name,lastName);
		System.out.println("metodo GET ->"+Rest.BASE.toString()+userConsult+AUTHORIZATION.toString());
		actor.attemptsTo(Get.resource(userConsult+AUTHORIZATION.toString())
		        );
		
	}
	
	 public static ConsultUser with(String consult, String name, String lastName){
	        return instrumented(ConsultUser.class,consult, name, lastName);
	    }

}
