package com.cg.exception;

public class MovieException extends Exception {

	public MovieException() {
		super();
	}

	public MovieException(String Message) {
		super(Message);
		System.err.println(Message);

	}

}
