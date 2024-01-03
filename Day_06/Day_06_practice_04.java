package Day_06;

public class Day_06_practice_04 {
	public static void main(String[] args) {
		for(int i=0;i<7;i++) {
			for(int j=0;j<7-i;j++) {//*의 공백이 하나씩 줄어들음
				System.out.print(" ");
			}
			for(int k=0;k<(2*i)+1;k++) {//*이 홀수로 늘어남
				System.out.print("*");
			}
			System.out.println();//줄을 바꿈
		}
	}
}