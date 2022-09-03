package com.excep;

public class MinorException extends Exception{

	String name;

	public MinorException(String name) {
		super(name);
		this.name = name;
	}
	
	
}
