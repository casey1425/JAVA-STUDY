package Day_05;

import java.util.Scanner;

public class Day_05_practice_06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age=sc.nextInt();//나이를 입력받음
		if(age>19) {
			System.out.println("성인입니다.");//나이가 19보다 클 경우 성인입니다 문장 출력
		}else {
			System.out.println("미성년자입니다.");//나이가 19이하일경우 미성년자입니다 문장 출력
		}
	}
}