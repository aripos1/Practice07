package com.javaex.ex03;

public class Sparrow implements Soundable {

	private String sparrow;

	public Sparrow(String sparrow) {
		super();
		this.sparrow = sparrow;
	}

	public String sound() {
		return sparrow;
	}
}
