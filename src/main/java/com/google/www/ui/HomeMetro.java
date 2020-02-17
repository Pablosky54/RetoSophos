package com.google.www.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.metro.pe/especiales/cybermetro")
public class HomeMetro extends PageObject{
	
	public static HomeMetro newInstance(){
        return new HomeMetro();
    }
	
	public static final Target SEARCH_BUTTON = Target.the("search button in linio home page")
            .located(By.xpath("//button[@class='btn btn-primary btn-search']"));

}
