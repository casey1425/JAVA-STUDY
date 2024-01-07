package Day_08;

public class Day_08_practice_04 {
	public static void main(String[] args) {
		Day_08_practice_02 jogger=new Day_08_practice_02();//객체를 생성함 (static이 필요없음)
		jogger.name="Casey";
		jogger.sayName();//jogger 인스턴스 sayName()메서드 호출
		jogger.run();//jogger 인스턴스 run()메서드 호출
	}
}