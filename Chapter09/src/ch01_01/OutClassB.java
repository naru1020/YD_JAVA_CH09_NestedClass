package ch01_01;

public class OutClassB {

	private int num = 10;
	private static int sNum = 20;
	
	static class InStaticClass{
		int inNUm = 100;
		static int sInNum = 200;
		
		//정적 내부 클래스의 일반 메소드
		void inTest() {
			System.out.println("InStaticClass inNum = " + inNUm + "(내부 클래스의 인스턴스 변수 사용");
			System.out.println("InStaticClass sInNum = " + sInNum +  "(내부 클래스의 정적 변수 사용");
			System.out.println("OutClass sNum =" + sNum + "(외부 클래스의 정적 변수 사용)");
		
			//num += 10;
		}
		
		//정적 내부 클래스의 정적 메소드
		static void sTest() {
			System.out.println("InstaticClass sInNum = " + sInNum );
		}
	}
}
