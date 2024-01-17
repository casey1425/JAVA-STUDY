package simple_project_interface;

public class Car implements Transportation{
	 //필드: 브랜드
    private String brand;

    //생성자: 브랜드를 매개변수로 받아 초기화
    public Car(String brand) {
        this.brand = brand;
    }

    //start 메소드 구현
    @Override
    public void start() {
        System.out.println(brand + " 차가 시동을 걸고 출발합니다.");
    }

    //stop 메소드 구현
    @Override
    public void stop() {
        System.out.println(brand + " 차가 멈춥니다.");
    }
}