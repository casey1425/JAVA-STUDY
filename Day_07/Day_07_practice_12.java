package Day_07;

import java.util.Arrays;

public class Day_07_practice_12 {
	public static void main(String[] args) {
		int[]card= {3,1,4,5,10};
		int[]newCard=Arrays.copyOf(card, card.length);
		//Arrays.copyof(배열, 복사범위)는 배열의 deep copy이다.
		System.out.println("card 배열 : "+Arrays.toString(card));
		
		card[1]=10;//card배열의 값을 바꿔줌
		System.out.println("card 배열 : "+Arrays.toString(card));
		System.out.println("newCard 배열 : "+Arrays.toString(newCard));//deep copy는 원래 배열의 값을 바꿔도 영향을 받지 않음.
	}
}