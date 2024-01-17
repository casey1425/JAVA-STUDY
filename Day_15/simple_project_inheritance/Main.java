package simple_project_inheritance;

public class Main {
	public static void main(String[] args) {
        Warrior warrior = new Warrior("전사", 10, 100, 20);
        Mage mage = new Mage("마법사", 12, 150, 30);

        //각 캐릭터의 정보 출력
        warrior.display();
        mage.display();

        //각 캐릭터의 공격 동작 출력
        warrior.attack();
        mage.attack();
    }
}