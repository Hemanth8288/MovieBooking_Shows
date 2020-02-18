package com.cg.client;

import com.cg.exception.MovieException;
import com.cg.service.ShowServiceImpl;

public class ShowClient {
	public static void main(String[] args) throws MovieException{
		ShowServiceImpl ser = new ShowServiceImpl();
	ser.getShows(2222, "NightShow").forEach(System.out::println);
		//System.out.println(ser.getShows(1111, "NoonShow"));
	}

}
