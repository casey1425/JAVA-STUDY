package Day_04;

public class Day_04_practice_05 {
	public static void main(String[] args) {
//		전위연산자와 후위연산자의 차이점
		int num=30;
		System.out.println(++num);//전위연산자이므로 이 줄부터 증가함. 30에서 1이 증가한 31이 출력됨
		System.out.println(num);
		System.out.println(num++);//후위연산자이므로 다음줄부터 증가함. 31이 출력
		System.out.println(num);//31에서 1이 증가한 32가 출력됨.
	}
}