package simple_project_animal;

public class Animal_main {
	public static void printCrying(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.cry();  // Cat 클래스의 cry 메소드 호출
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.cry();  // Dog 클래스의 cry 메소드 호출
        } else if (animal instanceof Mouse) {
            Mouse mouse = (Mouse) animal;
            mouse.cry();  // Mouse 클래스의 cry 메소드 호출
        } else {
            System.out.println("알 수 없는 동물 소리");
        }
    }

    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Mouse mouse = new Mouse();

        // "다형성"을 이용하여 각각의 동물 객체를 Animal 타입으로 받음
        printCrying(genericAnimal);
        printCrying(cat);
        printCrying(dog);
        printCrying(mouse);
    }
}