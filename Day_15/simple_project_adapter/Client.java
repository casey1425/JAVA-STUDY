package simple_project_adapter;

public class Client {
	private Player mediaPlayer;

    public Client(Player mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    // 미디어 플레이어 메소드 호출
    public void playMedia() {
        mediaPlayer.play();
    }

    public void pauseMedia() {
        mediaPlayer.pause();
    }

    public void stopMedia() {
        mediaPlayer.stop();
    }
}