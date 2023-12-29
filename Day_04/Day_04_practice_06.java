package Day_04;

public class Day_04_practice_06 {
	public static void main(String[] args) {
		//전, 후위 연산자 위치에 따른 결과
		int x = 1;
		System.out.println(x++);//후위연산자이므로 다음줄부터 증가함. 그대로 1이 출력됨
		System.out.println(x);//1이 증가한 2가 출력됨
		System.out.println(++x);//전위연산자이므로 이번줄부터 증가함. 1이 증가한 3이 출력됨.
	}
}