package com.github.zxhTom.common;

public class TransForm {

	private static TransForm transForm = new TransForm();
	
	public static TransForm getInstance(){
		return transForm;
	}
	public void sayHello(){
		System.out.println("Hello World");
	}
}
