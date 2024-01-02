package Day_05;

import java.util.Scanner;

public class Day_05_practice_03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		
		int age=sc.nextInt();
		if(age>19) {
			System.out.println("성인입니다.");//입력값이 19보다 크면 성인입니다 출력, 19보다 작으면 출력하지않음
		}System.out.println("프로그램을 종료합니다.");//if안에서의 결과와는 상관없이 출력
	}
}