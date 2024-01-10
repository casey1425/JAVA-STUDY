package Day_11;

public class Person {
	String name;
	int age;
	
	Person(String n, int a){
		name=n;
		age=a;//매개변수가 2개일때도 1개일때와 동일하게 선언해주면 된다.
	}
	void introduce() {
		System.out.println("안녕하세요, 저는 "+age+"세 "+name+"입니다.");
	}
}