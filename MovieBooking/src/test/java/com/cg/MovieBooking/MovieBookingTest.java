package com.cg.MovieBooking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cg.exception.MovieException;
import com.cg.moviebooking.dao.ShowDao;
import com.cg.moviebooking.dao.ShowDaoImpl;
import com.cg.service.ShowService;
import com.cg.service.ShowServiceImpl;

public class MovieBookingTest {
	@Test
	@DisplayName("Test Validation for Output of getShows for theatreId=2222")
	public void movieBookingTest1() throws MovieException {
		ShowService ser = new ShowServiceImpl();
		assertEquals(
				"[Afternoon20200216   2020-02-16T01:30   NoonShow   Bajrangi Bhaijan   Action   Shankar   139   1001   2222]",
				ser.getShows(2222, "NoonShow").toString());
	}

	@Test
	@DisplayName("Test Validation for Output of getShows for theatreId=1111")
	public void movieBookingTest2() throws MovieException {
		ShowService ser = new ShowServiceImpl();
		assertEquals(
				"[Morning20200216   2020-02-16T09:30   MorningShow   Bahubali   Drama   Rajamouli   142   1001   1111]",
				ser.getShows(1111, "MorningShow").toString());
	}

	@Test
	@DisplayName("TC_MOVIE_Ser_01")
	public void movieBookingTest3() {
		ShowService ser = new ShowServiceImpl();
		assertThrows(MovieException.class, () -> ser.getShows(10011001));
	}

	@Test
	@DisplayName("TC_MOVIE_Ser_02")
	public void movieBookingTest4() {
		ShowService ser = new ShowServiceImpl();
		assertThrows(MovieException.class, () -> ser.getShows(0));
	}
	@Test
	@DisplayName("TC_MOVIE_Ser_03")
	public void movieBookingTest5() {
		ShowService ser = new ShowServiceImpl();
		assertThrows(MovieException.class, () -> ser.getShows(1112));
	}
	@Test
	@DisplayName("TC_MOVIE_Dao_01")
	public void movieBookingTest6() {
		ShowDao ser = new ShowDaoImpl();
		assertThrows(MovieException.class, () -> ser.getShows(110011001));
	}
	@Test
	@DisplayName("TC_MOVIE_Dao_02")
	public void movieBookingTest7() {
		ShowDao ser = new ShowDaoImpl();
		assertThrows(MovieException.class, () -> ser.getShows(0));
	}
	@Test
	@DisplayName("TC_MOVIE_Dao_03")
	public void movieBookingTest8() {
		ShowDao ser = new ShowDaoImpl();
		assertThrows(MovieException.class, () -> ser.getTheatre(2223));
	}
	@Test
	@DisplayName("TC_MOVIE_Dao_04")
	public void movieBookingTest9() {
		ShowDao ser = new ShowDaoImpl();
		assertThrows(MovieException.class, () -> ser.getShows(11001101));
	}
	@Test
	@DisplayName("TC_MOVIE_Dao_05")
	public void movieBookingTest10() {
		ShowDao ser = new ShowDaoImpl();
		assertThrows(MovieException.class, () -> ser.getShows(0));
	}
	@Test
	@DisplayName("TC_MOVIE_Dao_06")
	public void movieBookingTest11() {
		ShowDao ser = new ShowDaoImpl();
		assertThrows(MovieException.class, () -> ser.getShows(1113));
	}
	@Test
	@DisplayName("TC_MOVIE_UI_01")
	public void movieBookingTest12() {
		ShowDao ser = new ShowDaoImpl();
		assertThrows(MovieException.class, () -> ser.getShows(1113));
	}

}
