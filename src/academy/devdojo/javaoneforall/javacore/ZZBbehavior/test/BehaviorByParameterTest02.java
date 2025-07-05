package academy.devdojo.javaoneforall.javacore.ZZBbehavior.test;


import academy.devdojo.javaoneforall.javacore.ZZBbehavior.domain.Car;
import academy.devdojo.javaoneforall.javacore.ZZBbehavior.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class BehaviorByParameterTest02 {
    private static List<Car> cars = List.of(new Car("Green", 1999), new Car("White", 1951), new Car("Red", 1983));

    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equalsIgnoreCase("green");
            }
        });
        System.out.println(greenCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

}
