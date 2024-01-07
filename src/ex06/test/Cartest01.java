package ex06.test;

import ex06.Car;

public class Cartest01 {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;


    public Cartest01() {

    }

    public Cartest01(String model) {
        this(model, "은색", 250);

    }

    public Cartest01(String model, String color) {
        this(model, color, 250);
    }

    public Cartest01(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
