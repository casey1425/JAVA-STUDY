package Day_06;

public class Day_06_practice_02 {
	public static void main(String[] args) {
		int sum=0;//합을 저장하는 변수 sum을 선언하고 초기화
		for(int i=1;i<=100;i++) {//i가 100이 될때까지 loop를 돌림
			if(i%2==0) {//짝수일때를 구함
				sum+=i;//짝수이면 sum에 더함(짝수의 합을 구함)
			}
		}System.out.println("합 : "+sum);
	}
}