package Review;

/*1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드(매개변수 o, 리턴값 o)
메소드명 : changeSign

2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드(매개변수 o, 리턴값 x)
메소드명 : printName

3. 5개의 정수 중 평균값을 반환하는 메소드(매개변수 o, 리턴값 o)
메소드명 : getAvg

4. 정수 배열 중 최대값과 최소값을 출력하는 메소드(매개변수 o, 리턴값 x)
메소드명 : printMinMax*/
public class review {
	public static void main(String[] args) {
		System.out.println("--------1번문제--------");
		int minusNum=-5;
		int posNum=10;
		
		System.out.println("원래 양수 : "+minusNum);
		System.out.println("바뀐 숫자 : "+posNum);
		
		System.out.println("원래 음수 : "+posNum);
		System.out.println("바뀐 숫자 : "+minusNum);
		
		System.out.println("--------2번문제---------");
		
		String name = "Casey";
        int repeatCount = 3;

        System.out.print("횟수 : ");
        printName(name, repeatCount);
        
        System.out.println("---------3번문제--------");
        int[] numbers = {10, 20, 30, 40, 50};
        double average = getAvg(numbers);

        System.out.println("평균 : " + average);
        System.out.println("---------4번문제--------");
        int[] nums = {5, 3, 8, 2, 7, 1};
        printMinMax(nums);
	}
	static int changeSign(int num) {//1번 메소드
		return -num;
	}
	static void printName(String name, int count) {//2번 메소드
		for(int i=0;i<count;i++) {
			System.out.println(name);
		}
	}
	static double getAvg(int[] array) {//3번 메소드
        if (array.length != 5) {
            return 0.0;
        }
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return (double) sum / array.length;
    }
	public static void printMinMax(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("배열이 비어있습니다.");
            return;
        }
        int min = array[0];
        int max = array[0];

        for (int i=1;i<array.length;i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("최소값: " + min);
        System.out.println("최대값: " + max);
    }
}