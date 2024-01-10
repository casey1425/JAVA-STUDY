package Day_11;

public class Day_11_practice_04 {
	public static void main(String[] args) {
		Phone p1=new Phone("갤럭시", 1, "흰색");//매개변수를 3개받는 생성자를 가져옴.
		Phone p2=new Phone("아이폰", 2);//매개변수를 2개받는 생성자를 가져옴.
		//자동으로 color부분에는 미리 선언한 Deep Purple이 들어감
		p1.phoneInfo();
		p2.phoneInfo();
	}
}