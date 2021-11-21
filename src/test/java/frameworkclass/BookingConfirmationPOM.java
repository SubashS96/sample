package frameworkclass;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.base.LibGlobal;
import com.pages.BookHotelPage;
import com.pages.BookingConfirmationPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class BookingConfirmationPOM extends LibGlobal {
	
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
	public void BookHotel() throws IOException {
		LoginPage loginpage = new LoginPage();
		loginpage.login(getData("Data", 2, 0), getData("Data", 2, 1));
		
		SearchHotelPage searchhotel = new SearchHotelPage();
		searchhotel.searchHotel(getData("Data", 2, 2), getData("Data", 2, 3), getData("Data", 2, 4), getData("Data", 2, 5), getData("Data", 2, 6), getData("Data", 2, 7), getData("Data", 2, 8), getData("Data", 2, 9));
		
		SelectHotelPage selecthotel = new SelectHotelPage();
		selecthotel.selectHotel();
		
		BookHotelPage bookhotel = new BookHotelPage();
		bookhotel.bookHotel(getData("Data", 2, 10), getData("Data", 2, 11), getData("Data", 2, 12), getData("Data", 2, 13), getData("Data", 2, 14), getData("Data", 2, 15), getData("Data", 2, 16), getData("Data", 2, 17));
		
		BookingConfirmationPage confirmation = new BookingConfirmationPage();
		confirmation.bookingConfirmation(null);
		
	}
	

}
