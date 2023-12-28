package Day_03;

public class Day_03_practice_17 {
	public static void main(String[] args) {
		int i=10;
		byte b=(byte)i;
		System.out.println("[int->byte] i의 값 :"+i+" b의 값 :"+b);//둘다 10, 10으로 정상출력됨.
		
		int j=1000;
		byte c=(byte)j;
		System.out.println("[int -> byte] j의 값 :"+j+" c의 값 :"+c);//여기서 c가 이상한 값이 나오는 이유는 byte값의 범위(-128~127)를 넘었기 때문이다.
	}
}