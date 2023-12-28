package Day_03;

public class Day_03_practice_14 {
	public static void main(String[] args) {
		double pi=3.14;
		int pieInt=(int)pi;//3.14의 int형인 3이 pieInt에 저장됨.
		System.out.println(pieInt);//3이 출력됨
		
		int num=100;
		double numD=(double)num;//100의 double형인 100.0이 저장됨.
		float numF=(float)100;//100의 float형인 100.0이 저장됨.
		System.out.println(numD);//100.0이 출력됨.
		System.out.println(numF);//100.0이 출력됨.
		
		int i=99999999;
		float f=(float)i;//float가 처리할 수 있는 범위를 벗어나므로 지수표기로 저장됨.
		System.out.println(f);
	}
}