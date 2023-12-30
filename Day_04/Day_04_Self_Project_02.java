package Day_04;

import java.util.Scanner;

public class Day_04_Self_Project_02 {
//	정수 2개를 입력받아 각 연산 결과 출력하기(한 줄에 하나씩 출력할 것)
//
//
//	[입출력 결과]
//	첫 번째 숫자 입력 : 10
//	두 번째 숫자 입력 : 3
//
//	10 + 3 = 13
//	10 - 3 = 7
//	10 * 3 = 30
//	10 / 3 = 3
//	10 % 3 = 1
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1, num2;
		 System.out.print("첫 번째 숫자 입력 : ");
		 num1=sc.nextInt();
		 System.out.print("두 번째 숫자 입력 : ");
		 num2=sc.nextInt();
		 System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
		 System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
		 System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
		 System.out.printf("%d/%d=%d\n", num1, num2, num1/num2);
		 System.out.printf("%d%%%d=%d", num1, num2, num1%num2);//%계산을 할때 뒤에 %d와 같이 %가 올땐 %%를 입력해줘야함
		 
	}
}