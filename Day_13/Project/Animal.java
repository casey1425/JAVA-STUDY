package project;

public class Animal {
	//필드
	protected String name;
	//생성자
	public Animal(String name) {
		this.name=name;
	}
	//메소드
	public void eat() {
		System.out.println("뽀삐가 먹이를 먹습니다.");
	}
	public static void main(String[] args) {
        Animal ppobbi = new Animal("뽀삐");
        ppobbi.eat();
    }
}