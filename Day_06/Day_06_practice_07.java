package Day_06;

import java.util.Scanner;

public class Day_06_practice_07 {
	public static void main(String[] args) {
		int magicNumber=(int)(Math.random()*50)+1;//랜덤변수 생성
		Scanner sc=new Scanner(System.in);
		boolean isMatched=false;
		
		for(int i=0;i<10;i++) {
			System.out.print("찾는 숫자를 입력하세요. : ");
			int guess=sc.nextInt();
			
			if(guess==magicNumber) {
				System.out.println((i+1)+"번째에 맞췄습니다.");
				isMatched=true;
				break;//guess와 magicNumber가 같으면 루프가 종료됨
			}else if(guess>magicNumber) {
				System.out.println("맞춰야할 숫자가 더 작습니다.");
			}else if(guess<magicNumber) {
				System.out.println("맞춰야할 숫자가 더 큽니다.");
			}
		}
		if(!isMatched) {
			System.out.println("정답을 맞추지 못했습니다.");
		}
	}
}