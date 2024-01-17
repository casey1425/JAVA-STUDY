package simple_project_interface;

public class Main {
	public static void main(String[] args) {
	        //Car와 Bicycle 클래스의 인스턴스 생성
	        Car car = new Car("Toyota");
	        Bicycle bicycle = new Bicycle("Blue");

	        //start 메소드 호출
	        car.start();
	        bicycle.start();

	        //stop 메소드 호출
	        car.stop();
	        bicycle.stop();
	    }
}