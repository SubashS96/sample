package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchHotelPage extends LibGlobal {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "location")
	private WebElement dDnLocation;
	
	@FindBy (id = "hotels")
	private WebElement dDnHotels;
	
	@FindBy (id = "room_type")
	private WebElement dDnRoomType;
	
	@FindBy (id = "room_nos")
	private WebElement dDNRoomNos; 
	
	@FindBy (id = "datepick_in")
	private WebElement txtCheckInDate;
	
	@FindBy (id = "datepick_out")
	private WebElement txtCheckOutDate;
	
	@FindBy (id = "adult_room")
	private WebElement dDnAdultsPerRoom;
	
	@FindBy (id = "child_room")
	private WebElement dDnChildrenPerRoom;
	
	@FindBy(id = "Submit")
	private WebElement btnSubmit;
	
	public WebElement getdDnLocation() {
		return dDnLocation;
	}
	public WebElement getdDnHotels() {
		return dDnHotels;
	}
	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}
	public WebElement getdDNRoomNos() {
		return dDNRoomNos;
	}
	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}
	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}
	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}
	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	public void searchHotel(String Location, String Hotels, String Roomtype, String RoomNos, String CheckInDate, String CheckOutDate, String AdultsPerRoom, String ChildrenPerRoom){
		selectoptionbytext(getdDnLocation(), Location);
		selectoptionbytext(getdDnHotels(), Hotels);
		selectoptionbytext(getdDnRoomType(), Roomtype);
		selectoptionbytext(getdDNRoomNos(), RoomNos);
		type(getTxtCheckInDate(), CheckInDate);
		type(getTxtCheckOutDate(), CheckOutDate);
		selectoptionbytext(getdDnAdultsPerRoom(), AdultsPerRoom);
		selectoptionbytext(getdDnChildrenPerRoom(), ChildrenPerRoom);
		click(getBtnSubmit());
	}

}
