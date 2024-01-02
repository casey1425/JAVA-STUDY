package Day_05;

public class Day_05_practice_05 {
	public static void main(String[] args) {
		int a=4;
		int b=10;
		int max=0;
		
		if(a>b) {
			max=a;//a보다 b가 작으므로 if안에서 max에 a가 저장되지 않음.
		}else {
			max=b;//a보다 b가 크므로 max에 b가 저장됨.
		}
		System.out.println(a+"와(과) " +b+" 중에 큰 수는 "+max+"입니다.");
	}
}