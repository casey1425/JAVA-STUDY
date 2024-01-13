package Day_13;

public class Day_13_practice_01 {
	public static void main(String[] args) {
		Bike b=new fourWheelBike("길동");
		b.info();
		b.ride();
		System.out.println();
		fourWheelBike fwb=(fourWheelBike)b;//타입을 강제로 변환함.
		fwb.addWheel();
		fwb.info();
		fwb.ride();
	}
}