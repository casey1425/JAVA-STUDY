package Day_07;

import java.util.Scanner;

public class Day_07_Self_Project_03 {
	public static void main(String[] args) {
//		5칸 짜리 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 비밀번호를 입력하게 하고, 입력된 비밀번호와 사물함의 비밀번호를 비교하여 일치 여부를 출력하기
		// 1. 5칸짜리 사물함의 비밀번호를 각각 배열에 저장한다.
		// 2. 사용자에게 이용할 사물함 번호를 묻는다.
		// 3. 비밀번호를 입력받아 확인한다.
		// 4. 일치/불일치 를 출력한다.
		Scanner sc=new Scanner(System.in);
		String[]password= {"0000", "1111", "2222", "3333", "4444"};//5칸짜리 비밀번호를 배열에 저장
		System.out.print("사물함 번호를 입력하세요 (1~5) : ");//사용자에게 이용할 사물함 번호를 물어봄
		int num=sc.nextInt();//사물함 번호 입력
		
		if(num>=1&&num<=password.length) {
			int index=num-1;//배열 인덱스로 변환해줌
			System.out.print("비밀번호를 입력하세요 (4자리) : ");//사용자에게 비밀번호를 입력받음
			String userPassword=sc.next();
			if(userPassword.equals(password[index])) {//입력된 비밀번호와 사물함 비밀번호를 비교함
				System.out.println("일치");//일치할때 출력
			}else {
				System.out.print("불일치");//불일치 할때 출력
			}
		}
		else {
			System.out.print("사물함 번호가 틀립니다. 1~5까지의 숫자를 입력하세요.");//사물함번호가 1~5가 아닐때 출력
		}
	}
}