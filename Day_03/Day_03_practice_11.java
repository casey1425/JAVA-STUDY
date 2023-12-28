package Day_03;

public class Day_03_practice_11 {
	public static void main(String[] args) {
		int num1=11;
		double num2=3.14;
		double num1Change=(double)num1;//num1의 double형태인 11.0이 저장됨.
		
		System.out.println("num1 : "+num1);
		System.out.println("num1Change : "+num1Change);
		System.out.println(num1Change+num2);// 11.0+3.14가 계산됨.
		System.out.println((int)1.23);//1.23의 int형태인 1이 출력됨.
	}
}