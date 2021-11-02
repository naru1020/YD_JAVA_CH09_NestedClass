package com.yedam.ch02_02;

public class Anonymous {

	private int field;
	
	public void method(int arg1, int arg2) {
		
		//arg1 = 20;
		//arg2 = 20;
		
		field = 10;
		
		int var1 = 30;
		int var2 = 30;
		
		//var1 = 2;
		//var2 = 2;
	
		
		Calulatable calc = new Calulatable() {
			
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}
