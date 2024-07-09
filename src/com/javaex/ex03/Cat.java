package com.javaex.ex03;

public class Cat implements Soundable {

	private String cat;

	public Cat(String cat) {
		super();
		this.cat = cat;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}
	
	@Override
	public String sound() {
		return cat;
	}
	
}
