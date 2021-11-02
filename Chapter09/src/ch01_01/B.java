package ch01_01;

public class B {

	//바깥 필드와 메소드에서 메소드가 어떻게 사용 제한이 되는가.
	//인스턴스 필드의 경우 인스턴스 멤버 클래스와 정적 멤버 클래스에 모두 접근할 수 있다.
	X field1 = new X();
	Y field2 = new Y();
	
	//인스턴스 멤버 클래스의 경우 static 필드로 선언이 불가능하다. 정적 필드에서는 가능
	//static X field3 = new X();
	static Y field4 = new Y();
	
	//인스턴스 메소드는 인스턴스 멤버 클래스와 정적 멤버 클래스 모두 가능
	void method1() {
		X var1 = new X();
		Y var2 = new Y();
	}
	
	//정적 메소드로 인스턴스 멤버 클래스 사용 불가. 정적 멤버 클래스는 가능
	static void method2() {
		//X var1 = new X();
		Y var2 = new Y();
	}
	
	//인스턴스 멤버 클래스
	class X{}
	
	//정적 멤버 클래스
	static class Y{}
	
	
}
