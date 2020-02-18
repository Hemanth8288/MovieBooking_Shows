package com.cg.entity;

import java.time.LocalDateTime;
import java.util.Date;

public class Show {
	private String showId;
	private LocalDateTime showStartTime;
	
	private String showName;
	private Movie movieName;
	private Integer screenId;
	private Integer theatreId;

	public Show() {
		// TODO Auto-generated constructor stub
	}

	public Show(String showId, LocalDateTime showStartTime,String showName, Movie movieName,
			Integer screenId, Integer theatreId) {

		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showName = showName;
		this.movieName = movieName;
		this.screenId = screenId;
		this.theatreId = theatreId;

	}

	
	
	public String getShowId() {
		return showId;
	}

	public void setShowId(String showId) {
		this.showId = showId;
	}

	public LocalDateTime getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(LocalDateTime showStartTime) {
		this.showStartTime = showStartTime;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public Movie getMovieName() {
		return movieName;
	}

	public void setMovieName(Movie movieName) {
		this.movieName = movieName;
	}

	public Integer getScreenId() {
		return screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	public Integer getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}

	@Override
	public String toString() {

		return showId + "   " + showStartTime + "   " + showName + "   " + movieName + "   " + screenId
				+ "   " + theatreId;
	}

}
