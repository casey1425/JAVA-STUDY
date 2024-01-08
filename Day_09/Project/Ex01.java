package Project;

public class Ex01 {
	public static void main(String[] args) {
        int[][] matrix = new int[3][3];//3X3크기의 정수형 2차원 배열 생성.
        int value = 1;//행렬에 할당될 값 초기화.

        for (int i = 0; i < 3; i++) {//행렬에 값을 할당
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = value;//현재 값을 할당
                value++;//다음 값으로 증가
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();//각 행의 끝에서 줄을 바꿔줌
        }
    }
}