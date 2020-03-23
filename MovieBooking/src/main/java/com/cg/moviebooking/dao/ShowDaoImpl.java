package com.cg.moviebooking.dao;

import java.util.List;
import java.util.Map;

import com.cg.entity.Show;
import com.cg.entity.Theatre;
import com.cg.exception.MovieException;
import com.cg.repo.ShowRepo;

public class ShowDaoImpl implements ShowDao {
	Map<Integer, Theatre> theatremap = ShowRepo.theatreMap;

	@Override
	public Theatre getTheatre(int theatreId) throws MovieException {
		if (!theatremap.containsKey(theatreId))
			throw new MovieException("Theatre Does not exists!");

		return theatremap.get(theatreId);
	}

	@Override
	public List<Show> getShows(int theatreId) throws MovieException {
		if (!theatremap.containsKey(theatreId))
			throw new MovieException("Theatre Does not exists!");
		
		List<Show> lst = theatremap.get(theatreId).getShows();
		if (lst.isEmpty())
			throw new MovieException("Moivie Not Found");
		return lst;
	}

	
}
