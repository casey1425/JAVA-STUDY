package simple_project_adapter;

public class Main {
	public static void main(String[] args) {
        // PlayerAdapter 인스턴스 생성
        PlayerAdapter playerAdapter = new PlayerAdapter();

        // Client 인스턴스 생성하면서 PlayerAdapter를 전달
        Client client = new Client(playerAdapter);

        // 클라이언트의 Player 메소드 사용하는 코드
        client.playMedia();
        client.pauseMedia();
        client.stopMedia();
    }
}