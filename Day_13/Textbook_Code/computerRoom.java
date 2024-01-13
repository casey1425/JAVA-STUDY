package Day_13;

public class computerRoom {
	Samsung computer1;
	Samsung computer2;
	
	void allPowerOn() {
		computer1.powerOn();
		computer2.powerOn();
	}
	void allPowerOff() {
		computer1.powerOff();
		computer2.powerOff();
	}	
}