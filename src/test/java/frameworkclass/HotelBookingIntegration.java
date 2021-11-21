package frameworkclass;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.base.LibGlobal;

import junit.framework.Assert;

public class HotelBookingIntegration extends LibGlobal {
	private static final String Sydney = null;
	@BeforeClass
	public static void beforeClass() {
		getdriver();
		loadurl("http://adactinhotelapp.com/index.php");
		maximize();
		}
	@AfterClass
	public static void afterClass() {
		closeAllWindows();
	}
	@Test
	public void test() throws IOException, InterruptedException {
		Assert.assertTrue("Existing User Login", true);
		type(findlocatorbyid("username"),getData("Data", 2, 0));
		type(findlocatorbyid("password"),getData("Data", 2, 1));
		click(findlocatorbyid("login"));
		Assert.assertTrue("Search Hotel", true);
		selectoptionbytext(findlocatorbyid("location"),getData("Data", 2, 2));
		selectoptionbytext(findlocatorbyid("hotels"),getData("Data", 2, 3));
		selectoptionbytext(findlocatorbyid("room_type"),getData("Data", 2, 4));
		selectoptionbytext(findlocatorbyid("room_nos"),getData("Data", 2, 5));
		type(findlocatorbyid("datepick_in"),getData("Data", 2, 6));
		type(findlocatorbyid("datepick_out"),getData("Data", 2, 7));
		selectoptionbytext(findlocatorbyid("adult_room"),getData("Data", 2, 8));
		selectoptionbytext(findlocatorbyid("child_room"),getData("Data", 2, 9));
		click(findlocatorbyid("Submit"));
		Assert.assertTrue("Select Hotel", true);
		click(findlocatorbyid("radiobutton_0"));
		click(findlocatorbyid("continue"));
		Assert.assertTrue("Book A Hotel", true);
		type(findlocatorbyid("first_name"),getData("Data", 2, 10));
		type(findlocatorbyid("last_name"),getData("Data", 2, 11));
		type(findlocatorbyid("address"),getData("Data", 2, 12));
		type(findlocatorbyid("cc_num"),getData("Data", 2, 13));
		selectoptionbytext(findlocatorbyid("cc_type"),getData("Data", 2, 14));
		selectoptionbytext(findlocatorbyid("cc_exp_month"),getData("Data", 2, 15));
		selectoptionbytext(findlocatorbyid("cc_exp_year"),getData("Data", 2, 16));
		type(findlocatorbyid("cc_cvv"),getData("Data", 2, 17));
		click(findlocatorbyid("book_now"));
		Thread.sleep(5000);
		Assert.assertTrue("Booking Confirmation", true);
		System.out.println(getAttributevalue(findlocatorbbyname("order_no")));
		writeData("Data", 2, 18, getattributevalue(findlocatorbbyname("order_no")));
	}
	
	}


