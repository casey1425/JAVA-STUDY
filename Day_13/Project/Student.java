package project;

public class Student extends Person {
    // 필드
    String department;
    private int studentNumber;
    String subject;
    int score;

    // 생성자
    public Student(String name, int age, int studentNumber, int score) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.score = score;
    }

    // 메소드
    public void studentInfo() {
        System.out.println("이름: " + getName());
        System.out.println("학과: " + department);
        System.out.println("과목: " + subject);
        System.out.println("점수: " + score);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
