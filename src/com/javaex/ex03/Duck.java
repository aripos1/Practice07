package com.javaex.ex03;

public class Duck implements Soundable {

	private String duck;

	public Duck(String duck) {
		super();
		this.duck = duck;
	}

	public String sound() {
		return duck;
	}
}
