package simple_project_inheritance;

public class Mage extends Character{
	//필드
	int mana;
    int spellPower;
    //생성자
    public Mage(String name, int level, int mana, int spellPower) {
        super(name, level);
        this.mana = mana;
        this.spellPower = spellPower;
    }
    //메소드
    @Override
    public void attack() {
        System.out.println("마법사가 주문을 겁니다!");
    }
}