package project;

public class Main {
    public static void main(String[] args) {
        // Person 클래스 객체 생성 후 메소드 호출
        Person person = new Person("홍길동", 24);
        System.out.println("Person 클래스 객체 생성 후 메소드 호출:");
        person.printInfo();
        System.out.println();

        // 나이에 +1 후 결과 출력
        System.out.println("나이에 +1 후 결과 출력:");
        person.setAge(person.getAge() + 1);
        person.printInfo();
        System.out.println();

        // Student 클래스 객체 생성 후 메소드 호출
        Student student = new Student("이순신", 20, 2024, 88);
        System.out.println("Student 클래스 객체 생성 후 메소드 호출:");
        student.studentInfo();
        System.out.println();

        // Student 클래스에서 printInfo 오버라이딩 메소드 호출
        System.out.println("Student 클래스에서 printInfo 오버라이딩 메소드 호출:");
        student.printInfo();
    }
}