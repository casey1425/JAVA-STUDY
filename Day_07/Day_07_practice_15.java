package Day_07;

public class Day_07_practice_15 {
	public static void main(String[] args) {
		int[][]arr=new int[5][5];//5*5헹렬 선언
		
		int count=1;
		
		for(int i=0;i<5;i++) {//한줄에 5개까지만 삽입
			for(int j=0;j<5;j++) {
				arr[i][j]=count++;//1부터 25까지 차례대로 배열에 삽입
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+" ");//배열 출력
			}
			System.out.println();
		}
	}
}