package Day_08;

import java.util.Scanner;

public class Day_08_04 {
	public static void main(String[] args) {
//		public : 모든곳에서 사용가능
//		static : 메모리에 제일 먼저 올린다(프로그램 실행시 처음에 올림)
//		void : 반환값이 없다
//		main : 메소드명
//		String[] args : 문자열배열 매개변수명
		
//		1. 매개변수x, 리턴타입x 메소드호출
		Day_08_04 mt=new Day_08_04();
		mt.printName();
		System.out.println("------------------");
		
//		2. 매개변수O, 리턴타입x 메소드호출
//		객체명.메소드명(인수1, 인수2)
		mt.printInfo("Casey", 24);
		System.out.println("------------------");
//		3. 매개변수x, 리턴타입O 메소드호출
//		변수=객체명.메소드명();
//		syso(객체명.메소드명());
		System.out.println(mt.printSum());
		System.out.println("------------------");
//		4. 매개변수ㅒ, 리턴타입O 메소드호출
//		변수 = 메소드명(인수); syso(변수);
//		syso(메소드명(인수));
		int result=mt.printTotal(10);
		System.out.println(result);
	}
//	1. 매개변수x, 리턴타입x 메소드

	void printName() {
		for(int i=0;i<5;i++) {
			System.out.println("Casey");//5번 출력됨.
		}
	}
//	2. 매개변수O, 리턴타입x 메소드
	void printInfo(String name, int age) {
		System.out.println("이름은 "+name+"이고, 나이는 "+age+"입니다.");
	}
//	3. 매개변수x, 리턴타입O 메소드
//	값을 입력받아 덧셈을 반환하는 메소드
	int printSum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("첫번째 정수입력 : ");
		int num1=sc.nextInt();
		System.out.println("두번째 정수입력 : ");
		int num2=sc.nextInt();
		return num1+num2;
	}
//	4. 매개변수O, 리턴타입O 메소드
//	정수 1개를 넘겨받아 1~정수까지의 합을 반환하는 메소드
	int printTotal(int num) {
		int total=0;
		for(int i=1;i<=num;i++) {
			total+=i;
		}
		return total;
	}
}