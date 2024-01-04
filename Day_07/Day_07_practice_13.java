package Day_07;

import java.util.Arrays;

public class Day_07_practice_13 {
	public static void main(String[] args) {
		int[]card= {1,6,4,5,3,2};
		int[]newCard=new int[card.length];
		System.arraycopy(card, 0, newCard, 0, card.length);
		//System.arraycopy(복사하는 대상, 복사 시작위치, 복사할 배열, 시작위치, 복사하는 길이);
		System.out.println("card의 배열 : "+Arrays.toString(card));
		System.out.println("newCard의 배열 : "+Arrays.toString(newCard));
	}
}