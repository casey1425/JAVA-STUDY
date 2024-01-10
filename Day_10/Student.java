package Day_10;

public class Student {
	static String schoolName="Myungji Univ.";//static을 이용해 정적 필드를 선언함.
	String studentName;//static이 없으므로 인스턴스 필드를 선언함.
	
	static void goToSchool() {//정적 메소드를 선언함.
		System.out.println("오늘은 학교가는 날!");
	}
	void hello() {//인스턴스 메소드를 선언함.
		System.out.println("안녕하세요, 제 이름은 "+studentName+"입니다.");
	}
}