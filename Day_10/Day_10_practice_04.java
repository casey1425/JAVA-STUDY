package Day_10;
//Student.java에서 이어짐.
public class Day_10_practice_04 {//클래스를 선언함
	public static void main(String[] args) {
		Student stu1=new Student();
		stu1.studentName="홍길동";
		stu1.hello();
		System.out.println("학교는 "+Student.schoolName+"입니다.");
		Student.goToSchool();
		
		Student stu2=new Student();
		stu2.studentName="이순신";
		stu2.hello();
		System.out.println("학교는 "+Student.schoolName+"입니다.");
		Student.goToSchool();		
	}
}