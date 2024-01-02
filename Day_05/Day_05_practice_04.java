package Day_05;

public class Day_05_practice_04 {
	public static void main(String[] args) {
		int num=5;
		
		if(num>4) {
			System.out.println(num+"은(는) 4보다 큽니다.");//조건식이 true이므로 해당 줄의 문장 출력
		}else {
			System.out.println(num+"은(는) 4보다 작습니다.");//if안에서 출력되었으므로 else안의 문장은 출력되지 않음.
		}
	}
}