package Day_06;

public class Day_06_practice_01 {
	public static void main(String[] args) {
		int sum=0;//합을 저장하는 변수 sum을 선언하고 0으로 초기화
		for(int i=1;i<=10;i++) {//i가 10이 될때까지 loop를 돌림
			sum+=i;//i가 10이 될때까지 반복하여 1을 증가시킴
		}
		System.out.println("합 : "+sum);
	}
}