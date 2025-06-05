package academy.devdojo.javaoneforall.javacore.Fstaticmodifier.test;

import academy.devdojo.javaoneforall.javacore.Fstaticmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari", 300);
        Car car2 = new Car("Audi", 280);
        Car car3 = new Car("BMW", 260);

        Car.setSpeedLimit(180);
        System.out.println(Car.getSpeedLimit());

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

    }
}
