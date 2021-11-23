package org.saturday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerDetails extends Baseclass2 {
	
	

	public CustomerDetails() {

		PageFactory.initElements(driver, this);
	}
		@FindBy(id="first_name")
		private WebElement fistname;
		
		@FindBy(id="last_name")
		private WebElement Lastname;
		
		@FindBy(id="address")
		private WebElement address;
		
		@FindBy(id="cc_num")
		private WebElement cardnumber;
		
		@FindBy(id="cc_type")
		private WebElement cardtype;
		
		@FindBy(id="cc_exp_month")
		private WebElement expiremonth;
		
		@FindBy(id="cc_exp_year")
		private WebElement expireyear;
		
		@FindBy(id="cc_cvv")
		private WebElement cvv;
		
		@FindBy(id="book_now")
		private WebElement booknow;

		public WebElement getFistname() {
			return fistname;
		}

		public WebElement getLastname() {
			return Lastname;
		}

		public WebElement getAddress() {
			return address;
		}

		public WebElement getCardnumber() {
			return cardnumber;
		}

		public WebElement getCardtype() {
			return cardtype;
		}

		public WebElement getExpiremonth() {
			return expiremonth;
		}

		public WebElement getExpireyear() {
			return expireyear;
		}

		public WebElement getCvv() {
			return cvv;
		}

		public WebElement getBooknow() {
			return booknow;
		}}
