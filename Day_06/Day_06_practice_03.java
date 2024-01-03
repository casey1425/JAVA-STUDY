package Day_06;

public class Day_06_practice_03 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {//2단부터 9단까지 반복함
			for(int j=1;j<=9;j++) {//각 단에서 곱하기 9까지 반복함
				System.out.print(i+"X"+j+"="+(i*j)+"\t");
			}System.out.println();//단 별로 줄을 바꿔줌
		}
	}
}