package ch01_01;

public class D {
	
	//로컬 클래스 사용 제한
	
	//자바 7 이전. 로컬 클래스는 파이널로만 선언 가능해서 수정이 불가능했음
	public void method1(int arg) {
		final int localVariable = 1;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8버전 이후. 파이널로 선언하지 않아도 됨. 그래서 수정이 가능한 것으로 보이나 그렇지 않음. 파이널의 속성을 지니는 것.
	public void method2(int arg) {
		int localVariable = 1;
		
		//arg=100; 컴파일 에러
		//localVariable = 100;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

}
