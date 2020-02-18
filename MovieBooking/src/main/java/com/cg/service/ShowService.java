package com.cg.service;

import java.util.List;

import com.cg.entity.Show;
import com.cg.exception.MovieException;

public interface ShowService {

	public List<Show> getShows(int theatreID)throws MovieException;
	public List<Show> getShows(int theatreID, String showNanme)throws MovieException;
}
