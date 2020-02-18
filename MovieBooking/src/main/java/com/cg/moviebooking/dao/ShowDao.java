package com.cg.moviebooking.dao;

import java.util.List;

import com.cg.entity.Show;
import com.cg.entity.Theatre;
import com.cg.exception.MovieException;

public interface ShowDao {
	
	public Theatre getTheatre(int theatreId)throws MovieException;
	
	public List<Show> getShows(int theatreId) throws MovieException;
	
	

}
