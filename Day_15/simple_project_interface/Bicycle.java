package simple_project_interface;

public class Bicycle implements Transportation {
    //필드: 색상
    private String color;

    //생성자: 색상을 매개변수로 받아 초기화
    public Bicycle(String color) {
        this.color = color;
    }

    //start 메소드 구현
    @Override
    public void start() {
        System.out.println("자전거가 출발합니다.");
    }

    //stop 메소드 구현
    @Override
    public void stop() {
        System.out.println("자전거가 정지합니다.");
    }
}