package org.saturday;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parllel extends Baseclass2 {

	@Test(dataProvider = "sampleData")
	private void tc1(String username,String password) {
		browserLaunch("https://adactinhotelapp.com/");
		LoginPage a = new LoginPage();
	    WebElement txtusername = a.getUsername();
	    enterText(txtusername, username );
	    WebElement password2 = a.getPassword();
	    enterText(password2, password);
	    WebElement login = a.getLogin();
	    buttonClick(login);
	    
	}}
