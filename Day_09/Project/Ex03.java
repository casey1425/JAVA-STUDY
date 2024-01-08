package Project;

public class Ex03 {
	// 정수를 실수로 곱하는 메소드
    static double multiply(int num1, double num2) {
        return num1 * num2;
    }
    // 세 개의 숫자를 곱하는 메소드 (오버로딩)
    static double multiply(int num1, double num2, int num3) {
        return num1 * num2 * num3;
    }
    public static void main(String[] args) {
        int intNum = 5;
        double doubleNum = 2.5;
        int anotherIntNum = 3;
        // 정수와 실수를 곱하는 메소드 호출
        System.out.println("정수와 실수의 곱: " + multiply(intNum, doubleNum));
        // 세 개의 숫자를 곱하는 메소드 호출
        System.out.println("세 개의 숫자의 곱: " + multiply(intNum, doubleNum, anotherIntNum));
    }
}