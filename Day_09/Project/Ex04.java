package Project;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자를 입력하세요: ");
        String inputString = scanner.nextLine();

        String result = changeCase(inputString);
        System.out.println("변환된 결과: " + result);
    }

    // 소문자를 대문자로, 대문자를 소문자로 바꿔주는 메소드
    static String changeCase(String input) {
        // StringBuilder를 사용하여 문자열 수정
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // 대문자인 경우 소문자로, 소문자인 경우 대문자로 변경하여 StringBuilder에 추가
            if (Character.isUpperCase(currentChar)) {
                resultBuilder.append(Character.toLowerCase(currentChar));
            } else if (Character.isLowerCase(currentChar)) {
                resultBuilder.append(Character.toUpperCase(currentChar));
            } else {
                // 알파벳이 아닌 경우(숫자, 기호 등)는 그대로 추가
                resultBuilder.append(currentChar);
            }
        }

        // StringBuilder를 String으로 변환하여 반환
        return resultBuilder.toString();
    }
}