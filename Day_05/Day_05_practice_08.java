package Day_05;

import java.util.Scanner;

public class Day_05_practice_08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num=sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("num은 1입니다.");
			break;
		case 7:
			System.out.println("num은 7입니다.");
			break;
		default://default는 위의 case가 모두 아닐때 출력된다.
			System.out.println("num은 1도 7도 아닙니다.");
		}
	}
}