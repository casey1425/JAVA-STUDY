package Day_07;

public class Day_07_practice_03 {
	public static void main(String[] args) {
		int[]intArray=new int[5];
		String[]strArray=new String[5];
		
		int[]varArray= {1,2,3,4,5};
		
		System.out.println("intArray[0] = "+intArray[0]);//int배열의 초기값은 0이므로 0이 출력됨
		System.out.println("intArray[1] = "+intArray[1]);
		System.out.println("strArray[0] = "+strArray[0]);//String배열의 초기값은 null이므로 null이 출력됨
		System.out.println("strArray[1] = "+strArray[1]);
		System.out.println("varArray[0] = "+varArray[0]);//varArray배열의 0번째값이 출력됨
		System.out.println("varArray[1] = "+varArray[1]);
	}
}