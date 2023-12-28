package Day_03;

public class Day_03_practice_13 {
	public static void main(String[] args) {
		double d1=1.0e100;//float의 저장범위를 벗어나 infinity가 저장됨.
		float f1=(float)d1;
		System.out.println(f1);
		
		double d2=1.0e-100;//float의 저장범위를 벗어나 0.0이 저장됨.
		float f2=(float)d2;
		System.out.println(f2);
	}
}