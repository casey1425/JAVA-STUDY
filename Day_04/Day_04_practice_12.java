package Day_04;

public class Day_04_practice_12 {
//	복합대입연산자
	public static void main(String[] args) {
		int x=10;
		int y=1;
		y+=x;//y에 x에 1을 더한값인 11이 저장됨 (10+1)
		System.out.println(y);
		y*=x;//y에 x에 10을 곱한값인 10이 저장됨 (11*10)
		System.out.println(y);
		y%=x;//y에 x를 나눈값의 나머지인 0이 저장됨
		System.out.println(y);
	}
}