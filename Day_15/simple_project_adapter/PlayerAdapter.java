package simple_project_adapter;

public class PlayerAdapter implements Player{
	//MediaPlayer 인터페이스 구현
	 @Override
	    public void play() {
	        System.out.println("Adapter: 재생");
	    }

	    @Override
	    public void pause() {
	        System.out.println("Adapter: 일시중지");
	    }

	    @Override
	    public void stop() {
	        System.out.println("Adapter: 중지");
	    }
}