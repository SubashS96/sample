package frameworkclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.base.LibGlobal;

public class HotelBooking {
	public static void main(String[] args) throws IOException, InterruptedException {
	
		LibGlobal b = new LibGlobal();
		b.getdriver();
		b.loadurl("http://adactinhotelapp.com/index.php");
		b.maximize();
		Thread.sleep(3000);
		WebElement txtUser = b.findlocatorbbyname("username");
		b.type(txtUser, b.getData("Data", 2, 0));
		WebElement txtPass = b.findlocatorbyxpath("//input[@type='password']");
		b.type(txtPass, b.getData("Data", 2, 1));
		
		WebElement btnLogin = b.findlocatorbyid("login");
		b.click(btnLogin);
		
		WebElement txtLoc = b.findlocatorbyid("location");
		b.type(txtLoc, b.getData("Data", 2, 2));
		WebElement txtHotel = b.findlocatorbyid("hotels");
		b.type(txtHotel, b.getData("Data", 2, 3));
		WebElement txtRoom = b.findlocatorbyid("room_type");
		b.type(txtRoom, b.getData("Data", 2, 4));
		WebElement txtRoomno = b.findlocatorbyid("room_nos");
		b.type(txtRoomno, b.getData("Data", 2, 5));
		WebElement txtIndate = b.findlocatorbyid("datepick_in");
		b.type(txtIndate, b.getData("Data", 2, 6));
		WebElement txtOutdate = b.findlocatorbyid("datepick_out");
		b.type(txtOutdate, b.getData("Data", 2, 7));
		WebElement txtAdult = b.findlocatorbyid("adult_room");
		b.type(txtAdult, b.getData("Data", 2, 8));
		WebElement txtChild = b.findlocatorbyid("child_room");
		b.type(txtChild, b.getData("Data", 2, 9));
		WebElement btnSubmit = b.findlocatorbyid("Submit");
		b.click(btnSubmit);
		WebElement btnRadio = b.findlocatorbyid("radiobutton_0");
		b.click(btnRadio);
		WebElement btnContinue = b.findlocatorbyid("continue");
		
		b.click(btnContinue);
		WebElement txtFirstname = b.findlocatorbyid("first_name");
		b.type(txtFirstname, b.getData("Data", 2, 10));
		WebElement txtLastname = b.findlocatorbyid("last_name");
		b.type(txtLastname, b.getData("Data", 2, 11));
		WebElement txtAddress = b.findlocatorbyid("address");
		b.type(txtAddress, b.getData("Data", 2, 12));
		WebElement txtCcnum = b.findlocatorbyid("cc_num");
		b.type(txtCcnum, b.getData("Data", 2, 13));
		WebElement txtCctype = b.findlocatorbyid("cc_type");
		b.type(txtCctype, b.getData("Data", 2, 14));
		WebElement txtCcexpmonth = b.findlocatorbyid("cc_exp_month");
		b.type(txtCcexpmonth, b.getData("Data", 2, 15));
		WebElement txtCcexpyear = b.findlocatorbyid("cc_exp_year");
		b.type(txtCcexpyear, b.getData("Data", 2, 16));
		WebElement txtCccvv = b.findlocatorbyid("cc_cvv");
		b.type(txtCccvv, b.getData("Data", 2, 17));
		WebElement btnBooknow = b.findlocatorbyid("book_now");
		b.click(btnBooknow);
		Thread.sleep(5000);
//		WebElement data = b.findlocatorbbyname("order_no");
//		String value = b.getAttributevalue(data);
//		b.writeData("Data", 2, 19, value);
//		

	}

}
