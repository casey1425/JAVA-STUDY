package Day_05;

import java.util.Scanner;

public class Day_05_practice_09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하세요.(1~5) : ");
		
		int num=sc.nextInt();
		switch(num) {
		case 5:
			System.out.println("5를 입력하셨습니다.");
			break;//만약 5가 입력되면 break를 통해 loop를 빠져나감
		case 4:
			System.out.println("4를 입력하셨습니다.");
			break;
		case 3:
			System.out.println("3을 입력하셨습니다.");
			break;
		case 2:
			System.out.println("2를 입력하셨습니다.");
			break;
		case 1:
			System.out.println("1을 입력하셨습니다.");
			break;
		default:// 1에서 5까지의 숫자가 입력되지 않을때 출력
			System.out.println("1~5까지의 숫자를 입력하세요.");
		}
	}
}