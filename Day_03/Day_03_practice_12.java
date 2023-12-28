package Day_03;

public class Day_03_practice_12 {
	public static void main(String[] args) {
		int i1=10;
		byte b1=(byte)i1;//byte가 표현할 수 있는 범위(-128~127)안의 숫자이므로 그대로 변환됨.
		System.out.println(b1);
		
		int i2=128;
		byte b2=(byte)i2;//byte가 표현할 수 있는 범위를 넘어섰으므로 127다음 수 인 -128이 출력됨.
		System.out.println(b2);
	}
}