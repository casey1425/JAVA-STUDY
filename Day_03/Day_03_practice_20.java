package Day_03;

import java.util.Scanner;

public class Day_03_practice_20 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);//입력 메소드
		System.out.print("나이를 입력해 주세요 : ");
		int age=scanner.nextInt();//정수형을 입력받음.
		System.out.printf("내 나이는 %d세 입니다.", age);
	}
}