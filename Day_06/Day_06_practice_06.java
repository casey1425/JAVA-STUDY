package Day_06;

public class Day_06_practice_06 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				continue;//continue는 특정조건에서 수행하지 않고 건너뛸때 사용함.
			}
			sum+=i;
		}
		System.out.println("짝수 합 : "+sum);
	}
}