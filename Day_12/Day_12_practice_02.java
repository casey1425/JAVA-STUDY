package Day_12;

public class Day_12_practice_02 {
	public static void main(String[] args) {//메인 메소드 선언
		Apple A=new Apple();
		A.powerOn();//Apple클래스에서 overriding된 메소드가 출력됨.
		A.powerOff();
		
		Computer C=new Computer();
		C.powerOn();
		C.powerOff();
	}
}