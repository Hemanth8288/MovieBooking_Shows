package com.cg.service;

import java.util.List;
import java.util.stream.Collectors;

import com.cg.entity.Show;
import com.cg.exception.MovieException;
import com.cg.moviebooking.dao.ShowDao;
import com.cg.moviebooking.dao.ShowDaoImpl;

public class ShowServiceImpl implements ShowService {
	private ShowDao dao = new ShowDaoImpl();

	@Override
	public List<Show> getShows(int theatreId) throws MovieException {
		String str = String.valueOf(theatreId);
		if(!str.matches("[0-9]{4}")) {
			throw new MovieException("Invalid theatreId");
		}
		return dao.getShows(theatreId);
	}

	@Override
	public List<Show> getShows(int theatreId, String showName) throws MovieException {
		String str = String.valueOf(theatreId);
		if(!str.matches("[0-9]{4}")) {
			throw new MovieException("Invalid theatreId");
		}
		List<Show> showLst = dao.getShows(theatreId).stream().filter(show -> show.getShowName().equals(showName))
				.collect(Collectors.toList());
		return showLst;
	}

}
