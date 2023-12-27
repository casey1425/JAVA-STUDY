package Day_02;

public class Day_02_practice_04 {
	public static void main(String[] args) {
		System.out.printf("%d은 첫 번째, %f은 두 번째, %s은 세 번째이다.", 1, 2.0, "셋");
//		%d는 정수형을 출력, %f는 실수형을 출력, %s는 문자형을 출력한다
//		여기 %f의 결과값에서 2.000000이 아닌 2.0을 출력하려면 %.1f형태로 입력하여야한다.
		System.out.printf("\n%.1f", 2.0);// \n은 한줄 들여쓰기 기호이다
//		%.1f, %.2f등처럼 .뒤에 표기하고싶은 소수점 숫자를 입력하면 된다.
	}
}