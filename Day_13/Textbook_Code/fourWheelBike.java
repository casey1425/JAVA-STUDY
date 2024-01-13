package Day_13;

public class fourWheelBike extends Bike {

	fourWheelBike(String riderName) {//생성자를 만들어줌.
		super(riderName);
		// TODO Auto-generated constructor stub
	}

	@Override
	void info() {
		// TODO Auto-generated method stub
		super.info();
	}
	
	void addWheel() {
		if(wheel==2) {
			wheel=4;
			System.out.println(riderName+"의 자전거에 보조바퀴 부착.");
		}else {
			System.out.println(riderName+"의 자전거에는 이미 보조바퀴가 있습니다.");
		}
	}
}