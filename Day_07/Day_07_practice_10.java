package Day_07;

import java.util.Arrays;

public class Day_07_practice_10 {
	public static void main(String[] args) {
		int[]arr1= {1,2,3};
		int[]arr2= arr1;//arr1배열을 shallow copy해줌
		System.out.println("arr1의 배열 : "+Arrays.toString(arr1));
		arr2[1]=10;//arr2의 배열 값을 변경함
		System.out.println("arr2의 배열 : "+Arrays.toString(arr1));//arr1값을 변경한 경우 shallow copy된 arr2도 같이 변경됨.
		System.out.println("arr1의 배열 : "+Arrays.toString(arr2));
	}
}