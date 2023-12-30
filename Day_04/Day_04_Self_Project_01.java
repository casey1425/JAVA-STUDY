package Day_04;

import java.util.Scanner;

public class Day_04_Self_Project_01 {
//	사용자로부터 이름, 나이, 성별, 취미를 입력받아 출력하기
//
//	- 이름 : 문자열
//	- 나이 : 정수형
//	- 성별 : 문자형 (F 또는 M)
//	- 취미 : 문자열
//
//	입력예시
//	이름 입력 : 신짱구
//	나이 입력 : 5
//	성별 입력 : M
//	취미 입력 : 여행
//
//	출력예시
//	이름은 신짱구입니다.
//	제 나이는 5살이고 취미는 여행입니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, hobby;
		int age;
		char gender;
		System.out.print("이름 입력 : ");
		name=sc.next();
		System.out.print("나이 입력 : ");
		age=sc.nextInt();
		System.out.print("성별 입력 : ");
		gender=sc.next().charAt(0);//charAt(0)은 입력한 문자의 0번째 글자만 저장해준다. 즉 여기서 Male을 입력하면 M, Female을 입력하면 F를 저장한다.
		System.out.print("취미 입력 : ");
		hobby=sc.next();
		System.out.printf("이름은 %s입니다.\n", name);
		System.out.printf("제 나이는 %d살이고 취미는 %s 입니다.", age, hobby);
	}
}