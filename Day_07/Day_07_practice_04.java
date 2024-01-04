package Day_07;

public class Day_07_practice_04 {
	public static void main(String[] args) {
		int[]numbers=new int[10];//크기가 10인 배열 정의
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=(int)(Math.random()*30)+1;//랜덤변수를 통해 배열의 각 위치에 값을 입력
		}
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {//만약 짝수이면
				sum+=numbers[i];//sum에 짝수값을 더함
			}
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]+" ");
		}
		System.out.println();
		System.out.println("배열의 짝수들의 합 : "+sum);
	}
}