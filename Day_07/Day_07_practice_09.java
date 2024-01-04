package Day_07;

import java.util.Arrays;
import java.util.Comparator;

public class Day_07_practice_09 {
	public static void main(String[] args) {
		Integer[]arr= {1,6,2,3,10,7,4,5,8,9};
		System.out.println("정렬 전 배열 : "+Arrays.toString(arr));
		Arrays.sort(arr, Comparator.reverseOrder());//Arrays.sort()안의 comparator.reverseOrder()매서드를 이용해 내림차순 정렬함.
		System.out.println("내림차순 정렬 : "+Arrays.toString(arr));
	}
}