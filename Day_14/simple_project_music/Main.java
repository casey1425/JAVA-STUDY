package simple_project_music;

public class Main {
    public static void check(Music music) {
        if (music instanceof Ballad) {//발라드 타입이면
            Ballad ballad = (Ballad) music;
            ballad.mode();//발라드 클래스의 mode메소드 호출
            ballad.onlyBallad();//발라드 클래스의 onlyBallad메소드 호출
        } else if (music instanceof HipHop) {//힙합 타입이면
            HipHop hipHop = (HipHop) music;
            hipHop.mode();//힙합 클래스의 mode메소드 호출
            hipHop.onlyHipHop();//힙합 클래스의 onlyHipHop메소드 호출
        } else if (music instanceof Rock) {//락 타입이면
            Rock rock = (Rock) music;
            rock.mode();//락 클래스의 mode메소드 호출
            rock.onlyRock();//락 클래스의 onlyRock메소드 호출
        } else {//그 외 음악타입이면
            System.out.println("지원하지 않는 음악 형식");
        }
    }

    public static void main(String[] args) {
    	//객체 생성
        Ballad ballad = new Ballad();
        HipHop hipHop = new HipHop();
        Rock rock = new Rock();
        //음악 타입에 맞게 check메소드 호출
        check(ballad);
        check(hipHop);
        check(rock);

        // 예외 처리를 위해 Music 클래스의 인스턴스도 확인 가능하게 설정
        Music unknownMusic = new Music();
        check(unknownMusic);
    }
}