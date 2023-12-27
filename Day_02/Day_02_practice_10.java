package Day_02;

public class Day_02_practice_10 {
	public static void main(String[] args) {
	int myAge=20;
	int yourAge=30;
	int tempAge;
	
	tempAge=myAge;// tempAge가 myAge값인 20으로 설정됨.
	myAge=yourAge;// myAge가 yourAge값인 30으로 설정됨.
	yourAge=tempAge;// yourAge가 tempAge값인 20으로 설정됨.
	//왼쪽에 있는값에 오른쪽의 값을 대입하여 위와같은 결과가 발생함.
	System.out.println(myAge);
	System.out.println(yourAge);
	}
}