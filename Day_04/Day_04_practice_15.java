package Day_04;

public class Day_04_practice_15 {
//	논리연산자 &&, ||, ^
	public static void main(String[] args) {
		boolean b1=true;
		boolean b2=false;
		boolean b3=true;
		boolean b4=false;
		
		System.out.println("-----논리곱-----");//논리곱은 둘다 true일때만 true 나머지는 다 false
		System.out.println(b1&&b2);//하나가 false이므로 false
		System.out.println(b1&&b3);//둘다 true이므로 true
		System.out.println(b2&&b4);//둘다 false이므로 false
		System.out.println();
		
		System.out.println("-----논리합-----");//논리합은 둘다 false일때만 false 나머지는 다 true
		System.out.println(b1||b2);//b1이 true이므로 true
		System.out.println(b1||b3);//둘다 true이므로 true
		System.out.println(b2||b4);//둘다 false이므로 false
		System.out.println();
		
		System.out.println("-----배타적 논리합-----");//둘이 같으면 false, 다르면 true
		System.out.println(b1^b2);//둘이 다르므로 true
		System.out.println(b1^b3);//둘이 같으므로 false
	}
}