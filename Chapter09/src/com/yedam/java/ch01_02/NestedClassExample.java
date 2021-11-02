package com.yedam.java.ch01_02;

public class NestedClassExample {

	public static void main(String[] args) {

		Car myCar = new Car();

		Car.Tire tire = myCar.new Tire();
		Car.Engine engine = new Car.Engine();

		class BackgroundChangeListner implements CheckBox.OnselectListener{
			@Override
			void OnSelect() {
				System.out.println("배경을 변경합니다.");
			}
		}
	}
}
