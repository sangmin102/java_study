package ch06.sec07;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자 1: 모델만 설정
    public Car(String model) {
        this.model = model;
    }

    // 생성자 2: 모델과 색상 설정
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // 생성자 3: 모델, 색상, 최대 속도 설정
    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

