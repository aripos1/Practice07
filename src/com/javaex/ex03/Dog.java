package com.javaex.ex03;

public class Dog implements Soundable {

	private String dog;

	public Dog(String dog) {
		super();
		this.dog = dog;
	}

	public String getDog() {
		return dog;
	}

	public void setDog(String dog) {
		this.dog = dog;
	}

	public String sound() {
		return dog;
	}
}
