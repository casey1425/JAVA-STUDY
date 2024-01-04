package Day_07;

import java.util.Arrays;

public class Day_07_practice_11 {
	public static void main(String[] args) {
		int[]card= {1,6,4,5,3,2};
		int[]newCard=new int[card.length];//card배열을 복사할 newCard배열을 선언함
		
		for(int i=0;i<card.length;i++) {
			newCard[i]=card[i];//newCard배열에 card배열을 복사해줌.
		}
		System.out.println("card의 배열 : "+Arrays.toString(card));
		System.out.println("newCard의 배열 : "+Arrays.toString(newCard));
	}
}