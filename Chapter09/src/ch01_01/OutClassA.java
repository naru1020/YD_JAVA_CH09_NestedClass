package ch01_01;

public class OutClassA {

	private int num = 10;
	private static int sNum = 20;
	
	private InClassA inclassA;
	
	public OutClassA() {
		inclassA = new InClassA();
	}
	
	public void usingClass() {
		
	}
	
	class InClassA{
		int inNum = 100;
		
		void inTest() {
			System.out.println("outClass Num = " + num + "(외부 클래스의 인스턴스 변수");
			System.out.println("outClass sNum = " + sNum + "(외부 클래스의 정적 변수");
		}
	}
}
