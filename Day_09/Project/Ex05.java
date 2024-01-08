package Project;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사용자로부터 아이디와 비밀번호 입력 받음.
        System.out.print("아이디를 입력하세요: ");
        int id = sc.nextInt();

        System.out.print("비밀번호를 입력하세요: ");
        String password = sc.next();

        // 로그인 메소드 호출하여 결과를 출력함.
        boolean result = login(id, password);
        System.out.println("로그인 결과: " + result);
    }
    // 아이디와 비밀번호를 검증하여 로그인 여부를 반환하는 메소드
    static boolean login(int id, String password) {
        // 주어진 조건에 따라 로그인 여부를 판단함.
        return id == 1 && password.equals("1234");
    }
}