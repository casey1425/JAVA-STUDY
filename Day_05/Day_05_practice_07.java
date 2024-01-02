package Day_05;

import java.util.Scanner;

public class Day_05_practice_07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("좋아하는 숫자를 입력하세요 : ");
		int favorite=sc.nextInt();
		
		if(favorite<5) {
			System.out.println("좋아하는 숫자가 5보다 작습니다.");
		}else if(favorite>5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		}else {
			System.out.println("좋아하는 숫자가 5입니다.");
		}
	}
}