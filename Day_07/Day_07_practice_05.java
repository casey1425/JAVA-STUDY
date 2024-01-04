package Day_07;

public class Day_07_practice_05 {
	public static void main(String[] args) {
		char[]cards= {'1','L','2','O','3','V','E'};
		String myWord="";
		
		for(int i=0;i<cards.length;i++) {
			int word=cards[i];
			if((word>=65&&word<=90)||(word>=97&&word<=122)) {//아스키코드상 65~90은 A~Z, 97~122는 a~z이다
				myWord+=(char)word;//알파벳만 배열에 저장해줌
			}
		}
		System.out.println("단어 : "+myWord);
	}
}