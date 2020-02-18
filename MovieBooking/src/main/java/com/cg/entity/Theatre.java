package com.cg.entity;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
	// Creating the movie details variables as private.
		private int theatreId;
		private String theatreName;
		private String location;
		private int totalRows;
		private int totalColumns;
		private List<Show> shows = new ArrayList<>();

		// Creating default constructor
		public Theatre() {
		}
		// Creating parameterized constructor

		public Theatre(int theatreId, String theatreName, String location, int totalRows, int totalColumns) {
			super();
			this.theatreId = theatreId;
			this.theatreName = theatreName;
			this.location = location;
			this.totalRows = totalRows;
			this.totalColumns = totalColumns;
		}

		// Getters and Setters for the movie variables.
		public int getTheatreId() {
			return theatreId;
		}

		public void setTheatreId(int theatreId) {
			this.theatreId = theatreId;
		}

		public String getTheatreName() {
			return theatreName;
		}

		public void setTheatreName(String theatreName) {
			this.theatreName = theatreName;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public int getTotalRows() {
			return totalRows;
		}

		public void setTotalRows(int totalRows) {
			this.totalRows = totalRows;
		}

		public int getTotalColumns() {
			return totalColumns;
		}

		public void setTotalColumns(int totalColumns) {
			this.totalColumns = totalColumns;
		}

		public List<Show> getShows() {
			return shows;
		}

		public void setShows(List<Show> shows) {
			this.shows = shows;
		}

		@Override
		public String toString() {
			return theatreId+" "+ theatreName+" " + location+" "+  totalRows+" " + totalColumns;
		}
		

}
