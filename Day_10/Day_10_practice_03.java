package Day_10;
//Car.java에서 이어짐.
public class Day_10_practice_03 {
	public static void main(String[] args) {
		Car c=new Car();//클래스를 이용해 객체를 생성함.
		System.out.println("바퀴의 개수는 "+c.wheel+"개 입니다.");//필드값을 출력함
		
		c.wheel=5;//c객체의 wheel의 값을 5로 바꿔줌
		System.out.println("바퀴의 개수는 "+c.wheel+"개 입니다.");
		c.ride();//매서드를 사용함.
		c.ride();
	}
}