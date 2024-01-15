package project;

public class Person {
	//필드
	String country;
	private String name;
	private int age;
	//생성자
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	//메소드
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void printInfo() {
		System.out.println("국가 : "+country);
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	public void setAge(int i) {
		// TODO Auto-generated method stub
		
	}
}