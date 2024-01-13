package Day_13;

public class Day_13_practice_02 {
	public static void main(String[] args) {
		computerRoom cr=new computerRoom();
		cr.computer1=new Samsung();
		cr.computer2=new Samsung();
		
		cr.allPowerOn();
		cr.allPowerOff();
		
		System.out.println();
	}
}