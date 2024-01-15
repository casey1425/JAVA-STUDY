package project;

public class Cat extends Animal{
	private String color;
	//생성자
	public Cat(String name, String color) {
		super(name);
		this.color=color;
	}
	//메소드
	public void play() {
		System.out.println(color+"고양이"+name+"가 놀고있습니다.");
	}
	public void scratch() {
		System.out.println(name+"가 스크래치를 긁습니다.");
	}
	public static void main(String[] args) {
        Cat ppobbiCat = new Cat("뽀삐", "검은색");
        ppobbiCat.play();
        ppobbiCat.scratch();
    }
}