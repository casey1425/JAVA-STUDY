package Day_03;

public class Day_03_practice_18 {
	public static void main(String[] args) {
		double d1=1.1234;
		float f1=(float)d1;//double형에서 float형으로 강제 형변환됨.
		System.out.println("[double -> float] d1의 값 :"+d1+", f1의 값 :"+f1);
		
		double d2=1.0e-50;
		float f2=(float)d2;//f2값에 0.0이 저장됨 (float형 최소값보다 작음)
		System.out.println("[double -> float] d2의 값 :"+d2+", f2의 값 :"+f2);
		
		double d3=1.0e100;
		float f3=(float)d3;//f3값에 infinity가 저장됨 (float형 최대값보다 큼)
		System.out.println("[double -> float] d3의 값 :"+d3+", f3의 값 :"+f3);
		
		double d4=9.123456789;
		float f4=(float)d4;//float형은 소수점 밑 6자리까지만 반올림되어 표현됨
		System.out.println("[double -> float] d4의 값 :"+d4+", f4의 값 :"+f4);
	}
}