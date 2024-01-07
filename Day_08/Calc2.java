package Day_08;

public class Calc2 {
	public int sum(int[] nums) {
		int result=0;
		for(int i=0;i<nums.length;i++) {
			result+=nums[i];
		}
		return result;//매개변수로 받은값을 모두 더한 result값을 반환함.
	}
}