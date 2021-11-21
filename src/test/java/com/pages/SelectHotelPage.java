package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SelectHotelPage extends LibGlobal {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "radiobutton_0")
	private WebElement btnRadioButton;
	
	@FindBy (id = "continue")
	private WebElement btnContinue;
	
	public WebElement getBtnRadioButton() {
		return btnRadioButton;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public void selectHotel() {
		click(getBtnRadioButton());
		click(getBtnContinue());
	}
	
}


