package com.cg.entity;

import java.time.LocalDate;

/**
 * @author-hemanth
 * Movie Class Variable declarations
 * Movie no argument constructor
 * Movie constructor with parameters
 * getters and setters
 */
import java.util.Date;

public class Movie {
	private Integer movieId;
	private String movieName;
	private String movieGenre;
	private String movieDirector;
	private Integer movieLength;

	private LocalDate movieReleaseDate;

	public Movie() {

	}

	public Movie(Integer movieId, String movieName, String movieGenre, String movieDirector, Integer movieLength,
			LocalDate movieReleaseDate) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.movieDirector = movieDirector;
		this.movieLength = movieLength;
		this.movieReleaseDate = movieReleaseDate;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public Integer getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(Integer movieLength) {
		this.movieLength = movieLength;
	}

	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(LocalDate movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}

	@Override
	public String toString() {
		return movieName + "   " + movieGenre + "   " + movieDirector + "   " + movieLength;
	}

}
