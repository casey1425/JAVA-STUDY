package Day_07;

import java.util.Scanner;

public class Day_07_Self_Project_01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]arMath=new int[3];
		for(int i=0;i<arMath.length;i++) {
			System.out.print((i+1)+"번째 사람의 수학점수 : ");
			arMath[i]=sc.nextInt();
		}
		double sum=0;
		for(int score:arMath) {
			sum+=score;
		}
		double average=sum/arMath.length;
		System.out.println("3명의 학생들의 평균점수 : "+average);
	}
}