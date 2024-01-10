package Day_11;

public class Snack {//클래스를 선언해줌.
	int price;
	
	public Snack() {//기본 생성자
//		기본생성자는 매개변수가 별도로 존재하지 않음.
	}

	void info() {
		System.out.println("과자의 가격은 "+price+"원 입니다.");
	}
}