package Day_13;

public class Apple extends Computer{

	@Override
	void powerOn() {
		// TODO Auto-generated method stub
		super.powerOn();//부모 클래스의 powerOn()메소드 출력
		System.out.println("애플 컴퓨터 입니다.");//powerOn메소드를 override해줌
	}
	
}