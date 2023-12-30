package Day_04;

public class Day_04_Self_Project_04 {
//	형변환해서 출력하기
//
//	1) String 자료형 변수 선언 값 "123" int형, double형으로 변환 출력
//
//	2) int형과 double형으로 변환한 값을 변수에 저장 후 연산 출력
//
//	3) boolean 타입의 변수를 선언, 값은 false일 때 문자열로 변환 출력
//
//	4) 문자열  자료형 변수 선언 후 "4일차 과제입니다" 값 대입해서 4일차라는 문자열만 출력
	public static void main(String[] args) {
//		1번문제
		String num1="123";
		int num2=Integer.parseInt(num1);
		double num3=Double.parseDouble(num1);
		System.out.printf("int형 : %d, double형 : %f\n", num2, num3);
		
//		2번문제
		
//		3번문제
		boolean question=false;
		String result=String.valueOf(question);
		System.out.printf("결과 : %s\n", result);
//		4번문제
		String project="4일차 과제입니다.";
		String project1=project.substring(0,3);
		System.out.println(project1);
	}
}