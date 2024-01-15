package project;

public class Dog extends Animal{
	private String walk;
	public Dog(String name, String walk) {
		super(name);
		this.walk=walk;
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name+"가 개껌을 먹습니다.");
	}
	public void play(String place) {
		System.out.println(name+"가 "+place+"로 산책가자고 합니다.");
	}
	public static void main(String[] args) {
        // 테스트를 위한 예제
        Dog bobbyDog = new Dog("바비", "산책");
        bobbyDog.eat();
        bobbyDog.play("공원");
    }
}