package Day_07;

public class Day_07_practice_14 {
	public static void main(String[] args) {
		int[][]arr=new int[2][3];//2*3행렬 선언
		
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		
		arr[1][0]=11;
		arr[1][1]=12;
		arr[1][2]=13;//각행과 열에 숫자 대입
		
		System.out.println("행의 크기 : "+arr.length);
		System.out.println("1행의 크기 : "+arr[0].length);
		System.out.println("2행의 크기 : "+arr[1].length);
		System.out.println("arr[0][0] = "+arr[0][0]);
	}
}