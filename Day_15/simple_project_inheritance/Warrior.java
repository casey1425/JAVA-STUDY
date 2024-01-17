package simple_project_inheritance;

public class Warrior extends Character{
	//필드
	int health;//체력 정의
    int attackPower;//공격력 정의
    //생성자
    public Warrior(String name, int level, int health, int attackPower) {//이름, 레벨, 체력, 공격력을 매개변수로 받음
        super(name, level);
        this.health = health;
        this.attackPower = attackPower;
    }
    //메소드
    @Override
    public void attack() {
        System.out.println("전사가 검으로 공격합니다!");
    }
}