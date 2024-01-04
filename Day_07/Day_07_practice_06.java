package Day_07;

public class Day_07_practice_06 {
	public static void main(String[] args) {
		int[]arr= {1,6,2,3,10,7,4,5,8,9};
		int temp=0;
		
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {//앞에 있던 값이 뒤에 있던 값보다 크면 정렬해줌
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];//뒤에 있던값을 저장
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("정렬 후 출력 : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}