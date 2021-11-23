package org.Adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ada5 extends Baseclass1 {

		public Ada5() {
			
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="order_no")
		private WebElement orderno;

		public WebElement getOrderno() {
			return orderno;
		}
		
		
}
