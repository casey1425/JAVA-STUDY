package simple_project_inheritance;

public class Character {
	//필드
	String name;//이름 정의
    int level;//레벨 정의
    //생성자
    public Character(String name, int level) {//이름과 레벨을 매개변수로 받음
        this.name = name;//초기화해줌
        this.level = level;
    }
    //메소드
    public void attack() {
        System.out.println("캐릭터가 공격합니다!");
    }

    public void display() {
        System.out.println("이름: " + name + ", 레벨: " + level);
    }
}