package academy.devdojo.javaoneforall.javacore.Fstaticmodifier.domain;

public class Car {
    private String name;
    private double maxSpeeed;
    private static double speedLimit = 250; // The changes are valid for all objects of this class

    public Car(String name, double maxSpeeed) {
        this.name = name;
        this.maxSpeeed = maxSpeeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", maxSpeeed=" + maxSpeeed +
                ", speedLimit=" + speedLimit +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeeed() {
        return maxSpeeed;
    }

    public void setMaxSpeeed(double maxSpeeed) {
        this.maxSpeeed = maxSpeeed;
    }

    public static double getSpeedLimit() {
        return speedLimit; // Static methods are not tied to any object, this.speedLimit is not valid
    }

    public static void setSpeedLimit(double speedLimit) {
        Car.speedLimit = speedLimit;
    }
}
