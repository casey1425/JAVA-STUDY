package Day_03;

public class Day_03_practice_19 {
	public static void main(String[] args) {
		float f1=12345.67f;
		int i1=(int)f1;//12345.67f의 int형인 12345가 저장됨.
		System.out.println("[float->int] f1의 값 :"+f1+", i1의 값 :"+i1);
		
		double d1=12345.678;
		int i2=(int)d1;//12345.678의 int형인 12345가 저장됨.
		System.out.println("[double->int] d1의 값 :"+d1+", i2의 값 :"+i2);
	}
}