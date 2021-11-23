package org.saturday;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPortal extends Baseclass2 {
	
	public SelectPortal() {
		
		 PageFactory.initElements(driver, this);
		   
	}
	   @FindBy(id="radiobutton_0")
	   private WebElement radiobutton;
	   
	   @FindBy(id="continue")
	   private WebElement Continue;


	public WebElement getRadiobutton() {
		return radiobutton;
	}


	public WebElement getContinue() {
		return Continue;
	}}