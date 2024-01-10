package Day_11;

public class otherSnack {
	int price;
	otherSnack(int p){//생성자를 직접 선언해줌.
		price=p;//매개변수로 받은 값을 필드 price에 대입해줌.
	}
	void info() {
		System.out.println("과자의 가격은 "+price+"원 입니다.");
	}
}