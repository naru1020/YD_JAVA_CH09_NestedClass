package com.yedam.java.ch01_02;

public class Example {

	public static void main(String[] args) {
		
		Button button = new Button();
		
		button.setOnClickListener(new CallListener());
		button.touch();
		
		button.setOnClickListener(new MessageListener());
		button.touch();
		
	}
}
