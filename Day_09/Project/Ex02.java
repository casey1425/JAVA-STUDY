package Project;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원하는 행 수를 입력하세요: ");
        int numRows = sc.nextInt();
        printStar(numRows);//printStar 메소드를 이용하여 삼각형을 출력함.
    }
    // 삼각형을 출력하는 메소드
    public static void printStar(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // 각 행마다 *을 출력함.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 행의 끝에서 줄 바꿈.
            System.out.println();
        }
    }
}