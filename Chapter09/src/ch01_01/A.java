package ch01_01;

public class A {

	public A() {
		System.out.println("A 객체가 생성됨");
	}
	
	//인스턴스 멤버 클래스
	public class B{
		
		//필드
		int feild1;
		//static int feild2; 실행오류
		
		//생성자
		B(){
			System.out.println("b 객체가 생성됨."); 
		}
		
		//메소드
		void method1() {}
		//static void method2() {} 실행오류
	}
	
	//정적 멤버 클래스
	static class C{
		//필드
		int field1;
		static int field2;
		
		//생성자
		C(){
			System.out.println("c 객체가 생성됨");
		}
		
		//메소드
		void method1() {}
		static void method2() {}
	}
	
	//로컬 클래스
	void method() {
		class D {
			//필드
			int feild1;
			//int feild2;
			
			//생성자
			D(){
				System.out.println("D객체가 생성됨");
			}
			
			//메소드
			void method1() {}
			//static void method2() {}
			
		}
		
		D d = new D();
		d.feild1 = 3;
		d.method1();
	}
}
