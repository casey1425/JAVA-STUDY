package Day_12;

public class Customer extends Person{//Person클래스를 상속받는 Customer클래스 생성
	//필드
	int memberID;
	//생성자
	public Customer(String name, int age, int memberID) {
		super(name, age);
		this.memberID = memberID;
	}
	void enter() {
		System.out.println("회원번호 : "+memberID+"("+name+","+age+"세) 님 입장.");
		//name과 age는 부모 클래스에서 상속받은 필드이므로 별도로 선언을 해주지 않아도 됨.
	}
}