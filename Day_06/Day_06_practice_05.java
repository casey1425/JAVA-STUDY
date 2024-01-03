package Day_06;

public class Day_06_practice_05 {
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		while(i<=10) {//i가 10보다 작을때까지 반복함
			sum+=i;//sum에 i값을 누적시킴
			i++;//i가 증가됨
		}
		System.out.println("합 : "+sum);
	}
}