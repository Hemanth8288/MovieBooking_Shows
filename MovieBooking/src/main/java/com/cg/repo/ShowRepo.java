package com.cg.repo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.entity.Movie;
import com.cg.entity.Show;
import com.cg.entity.Theatre;

public class ShowRepo {
	public static Map<Integer, Theatre> theatreMap = new HashMap();

	static {
		Movie movie1 = new Movie(1, "Bahubali", "Drama", "Rajamouli", 142, LocalDate.of(2016, 7, 10));
		Movie movie2 = new Movie(2, "Bajrangi Bhaijan", "Action", "Shankar", 139, LocalDate.of(2018, 2, 28));
		Show show11 = new Show("Morning20200216", LocalDateTime.of(2020, 02, 16, 9, 30), "MorningShow", movie1,
				Integer.valueOf(1001), Integer.valueOf(1111));

		Show show12 = new Show("Afternoon20200216", LocalDateTime.of(2020, 02, 16, 1, 30), "NoonShow", movie1,
				Integer.valueOf(1001), Integer.valueOf(1111));

		Show show13 = new Show("Night20200216", LocalDateTime.of(2020, 02, 16, 5, 30), "FirstShow", movie1,
				Integer.valueOf(1001), Integer.valueOf(1111));
		List<Show> shows1 = new ArrayList<>();
		shows1.add(show11);
		shows1.add(show12);
		shows1.add(show13);
		Theatre theatre1 = new Theatre(1111, "Viva Mall", "Jalandhar", 12, 20);
		theatre1.setShows(shows1);
		theatreMap.put(1111, theatre1);
		Show show21 = new Show("Morning20200216", LocalDateTime.of(2020, 02, 16, 9, 30), "MorningShow", movie2,
				Integer.valueOf(1001), Integer.valueOf(2222));

		Show show22 = new Show("Afternoon20200216", LocalDateTime.of(2020, 02, 16, 1, 30), "NoonShow", movie2,
				Integer.valueOf(1001), Integer.valueOf(2222));

		Show show23 = new Show("Night20200216", LocalDateTime.of(2020, 02, 16, 5, 30), "FirstShow", movie2,
				Integer.valueOf(1001), Integer.valueOf(2222));

		List<Show> shows2 = new ArrayList<>();
		shows2.add(show21);
		shows2.add(show22);
		shows2.add(show23);
		Theatre theatre2 = new Theatre(2222, "Uni Mall", "Phagwara", 25, 20);
		theatre2.setShows(shows2);
		theatreMap.put(2222, theatre2);

	}

}
